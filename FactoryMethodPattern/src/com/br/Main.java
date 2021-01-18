package com.br;

import com.br.impl.EnglishTextFactory;
import com.br.impl.PortugueseTextFactory;
import com.br.impl.model.PortugueseText;
import com.br.interfaces.iTextOfTheDay;

public class Main {

    public static void main(String[] args) {
        // Create the factory for the portuguese text
        PortugueseTextFactory ptf = new PortugueseTextFactory();
        // Call the method to create the instance of iTextOfTheDay. The factory uses business logic to create the instance
        iTextOfTheDay portugueseText = ptf.createText("Trabalhadores do mundo, uni-vos!");
        System.out.println(portugueseText.getText());

        // Create the factory for the english text
        EnglishTextFactory etf = new EnglishTextFactory();
        // Call the method to create the instance of iTextOfTheDay. The factory uses business logic to create the instance
        iTextOfTheDay englishText = etf.createText("Working men of all countries, unite!");
        System.out.println(englishText.getText());
    }
}
