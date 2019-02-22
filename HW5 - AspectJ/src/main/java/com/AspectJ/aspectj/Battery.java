package com.AspectJ.aspectj;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    Float wH;

    Battery(Float wH) {
        this.wH = wH;
    }

    public String batteryInfo() {
        return "Battery capacity: " + wH;
    }
}
