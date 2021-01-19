package com.br.module;

import com.br.interfaces.iText;
import com.br.interfaces.iTitle;

public class PortugueseTitle implements iTitle {

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
