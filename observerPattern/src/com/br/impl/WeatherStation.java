package com.br.impl;

import com.br.interfaces.iObserver;
import com.br.interfaces.iObserversable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements iObserversable {

    private List<iObserver> observersList = new ArrayList();
    private String temperature;

    @Override
    public void add(iObserver observer) {
        this.observersList.add(observer);
    }

    @Override
    public void remove(iObserver observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void update() {
        this.observersList.forEach(observer -> observer.update());
    }

    public String getTemperature(){
        return this.temperature;
    }

    public void setTemperature(String tmp){
        this.temperature = tmp;
        update();
    }
}
