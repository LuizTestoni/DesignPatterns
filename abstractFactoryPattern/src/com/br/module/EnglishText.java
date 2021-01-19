package com.br.module;

import com.br.interfaces.iText;

public class EnglishText implements iText {

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
