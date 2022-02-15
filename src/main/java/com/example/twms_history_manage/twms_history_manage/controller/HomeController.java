package com.example.twms_history_manage.twms_history_manage.controller;


import com.example.twms_history_manage.twms_history_manage.domain.base.LogisticsCenter;
import com.example.twms_history_manage.twms_history_manage.domain.enums.Menu;
import com.example.twms_history_manage.twms_history_manage.service.base.LogisticsCenterService;
import com.example.twms_history_manage.twms_history_manage.service.base.StorageLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private Environment environment;
    @Autowired
    private LogisticsCenterService logisticsCenterService;
    @Autowired
    private StorageLocationService storageLocationService;

    @GetMapping
    public String index(Model model){
        model.addAttribute("database1",environment.getProperty("datasource.primary.url"));
        model.addAttribute("database2",environment.getProperty("datasource.secondary.url"));
        model.addAttribute("menus", Menu.toList());
        model.addAttribute("listLc",logisticsCenterService.getAllDB1());
        List<LogisticsCenter> tmp = logisticsCenterService.getAllDB2();
        return "index";
    }

    @GetMapping("check")
    public String check(Model model,@ModelAttribute("lcCode") String lcCode,@ModelAttribute("menu") String menu){
        model.addAttribute("database1",environment.getProperty("datasource.primary.url"));
        model.addAttribute("database2",environment.getProperty("datasource.secondary.url"));
        model.addAttribute("storageLocations",storageLocationService.getAllByLcCodeDB1(lcCode));
        model.addAttribute("storageLocations1",storageLocationService.getAllByLcCodeDB2(lcCode));
        model.addAttribute("warehouses",new ArrayList());

        return "check";
    }



}
