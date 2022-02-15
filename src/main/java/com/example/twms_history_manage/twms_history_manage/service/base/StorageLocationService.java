package com.example.twms_history_manage.twms_history_manage.service.base;

import com.example.twms_history_manage.twms_history_manage.domain.base.StorageLocation;


import java.util.List;

public interface StorageLocationService {
    List<StorageLocation> getAllByLcCodeDB1(String lcCode);
    List<StorageLocation> getAllByLcCodeDB2(String lcCode);
}
