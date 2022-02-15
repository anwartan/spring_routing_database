package com.example.twms_history_manage.twms_history_manage.domain.base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "twms_warehouse",schema = "dbo",catalog ="base")
public class Warehouse {
    @Id
    private Long whId;
    private String lcCode;
    private String name;
}
