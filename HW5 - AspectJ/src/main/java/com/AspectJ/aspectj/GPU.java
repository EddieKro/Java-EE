package com.AspectJ.aspectj;

import org.springframework.stereotype.Component;

@Component
public class GPU {
    String name;
    Integer memory;

    public GPU(String name, Integer memory) {
        this.name = name;
        this.memory = memory;
    }

    public String gpuInfo() {
        return "Name: " + name + " ; Memory: " + memory;
    }
}
