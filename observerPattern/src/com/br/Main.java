package com.br;

import com.br.impl.Display;
import com.br.impl.WeatherStation;

public class Main {

    public static void main(String[] args) {

        WeatherStation ws = new WeatherStation();

        // Create Observers using dependency injection
        Display ds1 = new Display(ws);
        ds1.setName("Celular");
        Display ds2 = new Display(ws);
        ds2.setName("Relógio");
        Display ds3 = new Display(ws);
        ds3.setName("Computador");

        // Registers the observers in the Observable (AKA subject)
        ws.add(ds1);
        ws.add(ds2);
        ws.add(ds3);

        // Changes the data in the observable to test the update
        System.out.println("Setting temperature to 25Cº");
        ws.setTemperature("25Cº");

        System.out.println("");
        System.out.println("Now setting temperature to 14Cº");
        ws.setTemperature("14Cº");
    }
}
