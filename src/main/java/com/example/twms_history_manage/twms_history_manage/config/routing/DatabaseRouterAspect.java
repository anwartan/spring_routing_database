package com.example.twms_history_manage.twms_history_manage.config.routing;

import com.example.twms_history_manage.twms_history_manage.config.db.RoutingDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DatabaseRouterAspect {

    @Around("@annotation(withDatabase)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, WithDatabase withDatabase) throws Throwable {
        try {
            RoutingDataSource.setCtx(withDatabase.value());
            return proceedingJoinPoint.proceed();
        } finally {
            RoutingDataSource.restoreCtx();
        }
    }
}