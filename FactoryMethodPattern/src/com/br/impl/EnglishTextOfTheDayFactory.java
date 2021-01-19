package com.br.impl;

import com.br.impl.model.EnglishTextOfTheDay;
import com.br.interfaces.iTextOfTheDay;
import com.br.interfaces.iTextOfTheDayFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EnglishTextOfTheDayFactory implements iTextOfTheDayFactory {

    @Override
    public iTextOfTheDay createText(String text) {
        EnglishTextOfTheDay englishText = new EnglishTextOfTheDay();
        englishText.setText(getPreFix() + text);
        return englishText;
    }

    private String getPreFix() {
        return "The text of the day " + LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + " is: ";
    }
}
