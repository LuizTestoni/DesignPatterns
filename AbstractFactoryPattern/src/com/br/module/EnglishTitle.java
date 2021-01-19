package com.br.module;

import com.br.interfaces.iTitle;

public class EnglishTitle implements iTitle {

    private String title;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTittle(String title) {
        this.title = title;
    }
}
