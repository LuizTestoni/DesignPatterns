package com.br.impl;

import com.br.interfaces.iDisplay;
import com.br.interfaces.iObserver;

public class Display implements iObserver, iDisplay {

    private WeatherStation weatherStation;
    private String name;

    public Display(WeatherStation ws){
        this.weatherStation = ws;
    }
    @Override
    public void update() {
        System.out.println(this.name + ": " + this.weatherStation.getTemperature());
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
