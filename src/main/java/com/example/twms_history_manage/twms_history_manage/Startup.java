package com.example.twms_history_manage.twms_history_manage;

import com.example.twms_history_manage.twms_history_manage.service.base.StorageLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Startup {

    @Autowired
    private StorageLocationService storageLocationService;

//    @EventListener(ApplicationReadyEvent.class)
    public void startUp() {
        System.out.println("App Started!");

//        System.out.println(this.userService.findAllDS1());
//        System.out.println(this.userService.findAllDS2());
//        System.out.println(this.userService.findAllDS3());

        // System.out.println(this.userService.findAllNestedTransactions());

        System.out.println(this.storageLocationService.getAllByLcCodeDB1("CPC"));
        System.out.println(this.storageLocationService.getAllByLcCodeDB2("CPC"));

        System.exit(0);
    }
}
