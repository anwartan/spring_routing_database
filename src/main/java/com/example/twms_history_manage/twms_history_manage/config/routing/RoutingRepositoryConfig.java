package com.example.twms_history_manage.twms_history_manage.config.routing;

import com.example.twms_history_manage.twms_history_manage.config.db.DataSourceType;
import com.example.twms_history_manage.twms_history_manage.config.db.RoutingDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Proxy;

@Slf4j
@Configuration
public class RoutingRepositoryConfig {

    @Autowired
    private TransactionalHelper transactionalHelper;
    private <E, ID, T extends JpaRepository<E, ID>> T createProxyInstance(T repository) {
        Class<?> repositoryType = repository.getClass().getInterfaces()[0];
        DataSourceType dataSourceType = repositoryType.getAnnotation(WithDatabase.class).value();

        Object instance;
        try {
            instance = Proxy.newProxyInstance(
                    Thread.currentThread().getContextClassLoader(),
                    new Class[]{repositoryType},
                    (proxy, method, args) -> this.transactionalHelper.runWithTransaction(() -> {
                        try {
                            RoutingDataSource.setCtx(dataSourceType);
                            return method.invoke(repository, args);
                        } finally {
                            RoutingDataSource.restoreCtx();
                        }
                    })
            );
        } catch (Exception ex) {
            log.error("Error while creating proxy for class {}", repository, ex);
            throw new RuntimeException(ex);
        }

        return (T) instance;
    }
}
