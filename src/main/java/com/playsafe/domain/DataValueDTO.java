package com.playsafe.domain;

public class DataValueDTO {

    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TemperatureDTO{" +
                "value=" + value +
                '}';
    }
}
