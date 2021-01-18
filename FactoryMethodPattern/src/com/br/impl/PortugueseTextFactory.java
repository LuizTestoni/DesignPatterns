package com.br.impl;

import com.br.impl.model.PortugueseText;
import com.br.interfaces.iTextOfTheDay;
import com.br.interfaces.iTextOfTheDayFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PortugueseTextFactory implements iTextOfTheDayFactory {

    @Override
    public iTextOfTheDay createText(String text) {
        PortugueseText portugueseText = new PortugueseText();
        portugueseText.setText(getPreFix() + text);
        return portugueseText;
    }

    private String getPreFix() {
        return "O texto do dia " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " é: ";
    }
}
