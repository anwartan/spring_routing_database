package com.example.twms_history_manage.twms_history_manage.domain.base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "twms_logistics_center", schema = "dbo", catalog = "base")
@Getter
@Setter
public class LogisticsCenter {
    @Id
    private String code;
    private String fullName;

}
