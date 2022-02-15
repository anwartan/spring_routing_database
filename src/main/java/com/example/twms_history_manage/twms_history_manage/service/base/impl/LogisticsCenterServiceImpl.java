package com.example.twms_history_manage.twms_history_manage.service.base.impl;

import com.example.twms_history_manage.twms_history_manage.domain.base.LogisticsCenter;
import com.example.twms_history_manage.twms_history_manage.repository.LogisticsCenterRepository;
import com.example.twms_history_manage.twms_history_manage.service.base.LogisticsCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticsCenterServiceImpl implements LogisticsCenterService {

    @Autowired
    private LogisticsCenterRepository logisticsCenterRepository;
    @Override
    public List<LogisticsCenter> getAllDB1() {
        return logisticsCenterRepository.findAll();
    }

    @Override
    public List<LogisticsCenter> getAllDB2() {
        return logisticsCenterRepository.findAll();
    }
}
