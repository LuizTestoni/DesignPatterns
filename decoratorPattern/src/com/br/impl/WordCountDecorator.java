package com.br.impl;

import com.br.abstracts.AbstractText;
import com.br.abstracts.AbstractTextDecorator;

public class WordCountDecorator extends AbstractTextDecorator {

    private AbstractText abstractText;

    public WordCountDecorator(AbstractText ab){
        this.abstractText = ab;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.abstractText.getText());
        sb.append("\n");
        sb.append("Quantidade de palavras: ");
        String[] words = this.abstractText.getText().split("\\s+");
        sb.append(words.length);

        return sb.toString();
    }
}
