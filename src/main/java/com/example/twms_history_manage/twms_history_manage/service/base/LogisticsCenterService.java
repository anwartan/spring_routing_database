package com.example.twms_history_manage.twms_history_manage.service.base;

import com.example.twms_history_manage.twms_history_manage.domain.base.LogisticsCenter;

import java.util.List;

public interface LogisticsCenterService {
    List<LogisticsCenter> getAllDB1();
    List<LogisticsCenter> getAllDB2();
}
