package com.example.twms_history_manage.twms_history_manage.domain.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Menu {
    INBOUND,
    PI_FORECAST,
    OUTBOUND_NOTE,
    PICKING_NOTE;

    public static List<Menu> toList(){
        return new ArrayList<>(Arrays.asList(Menu.values()));
    }
}
