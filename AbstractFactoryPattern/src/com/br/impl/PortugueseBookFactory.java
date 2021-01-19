package com.br.impl;

import com.br.interfaces.iBookFactory;
import com.br.interfaces.iText;
import com.br.interfaces.iTitle;
import com.br.module.EnglishText;
import com.br.module.EnglishTitle;

public class PortugueseBookFactory implements iBookFactory {

    @Override
    public iTitle getTitle(String title) {
        EnglishTitle englishTitle = new EnglishTitle();
        englishTitle.setTittle(title);
        return englishTitle;
    }

    @Override
    public iText getText(String text) {
        EnglishText englishText = new EnglishText();
        englishText.setText(text);
        return englishText;
    }
}
