package com.br.impl.model;

import com.br.interfaces.iTextOfTheDay;

public class EnglishTextOfTheDay implements iTextOfTheDay {

    private String text;

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
