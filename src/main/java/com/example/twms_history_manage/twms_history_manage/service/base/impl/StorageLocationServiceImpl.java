package com.example.twms_history_manage.twms_history_manage.service.base.impl;

import com.example.twms_history_manage.twms_history_manage.config.db.DataSourceType;
import com.example.twms_history_manage.twms_history_manage.config.routing.WithDatabase;
import com.example.twms_history_manage.twms_history_manage.domain.base.StorageLocation;
import com.example.twms_history_manage.twms_history_manage.repository.StorageLocationRepository;
import com.example.twms_history_manage.twms_history_manage.service.base.StorageLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StorageLocationServiceImpl implements StorageLocationService {
    @Autowired
    private StorageLocationRepository storageLocationRepository;


    @Override
    @WithDatabase
    public List<StorageLocation> getAllByLcCodeDB1(String lcCode) {
        return this.getAllByLcCode(lcCode);
    }

    @Override
    @WithDatabase(DataSourceType.SECONDARY)
    public List<StorageLocation> getAllByLcCodeDB2(String lcCode) {
        return this.getAllByLcCode(lcCode);
    }

    private List<StorageLocation> getAllByLcCode(String lcCode){
        return storageLocationRepository.getAllByLcCode(lcCode);
    }

}
