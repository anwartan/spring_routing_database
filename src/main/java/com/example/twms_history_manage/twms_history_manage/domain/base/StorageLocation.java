package com.example.twms_history_manage.twms_history_manage.domain.base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "twms_storage_location",schema = "dbo",catalog ="base")
public class StorageLocation {
    @Id
    private Long id;
    private String lcCode;
    private Integer whId;
    private Integer rrId;
    private String name;

}
