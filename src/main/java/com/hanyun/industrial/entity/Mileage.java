package com.hanyun.industrial.entity;

import lombok.Data;

@Data
public class Mileage {
    private String key;

    private Integer value;

    public Mileage(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
}
