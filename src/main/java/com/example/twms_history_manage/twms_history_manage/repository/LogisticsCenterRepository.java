package com.example.twms_history_manage.twms_history_manage.repository;

import com.example.twms_history_manage.twms_history_manage.domain.base.LogisticsCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticsCenterRepository extends JpaRepository<LogisticsCenter,String> {

}
