package com.example.twms_history_manage.twms_history_manage.repository;

import com.example.twms_history_manage.twms_history_manage.domain.base.StorageLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StorageLocationRepository extends JpaRepository<StorageLocation,Long> {
    List<StorageLocation> getAllByLcCode(String lcCode);
}
