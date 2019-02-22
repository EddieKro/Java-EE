package com.AspectJ.aspectj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Razer {
    @Autowired
    @Qualifier("decent")
    Battery battery;

    @Autowired
    @Qualifier("4k")
    Display display;

    @Autowired
    @Qualifier("Nvidia")
    GPU gpu;

    String name, condition;

    public Razer(String name) {
        this.name = name;
    }

    String getInfo() {
        return "Name: " + name + " \n" + battery.batteryInfo() + display.displayInfo() + gpu.gpuInfo();
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
