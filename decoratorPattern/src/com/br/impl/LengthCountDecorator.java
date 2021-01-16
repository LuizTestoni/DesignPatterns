package com.br.impl;

import com.br.abstracts.AbstractText;
import com.br.abstracts.AbstractTextDecorator;

public class LengthCountDecorator extends AbstractTextDecorator {

    private AbstractText abstractText;

    public LengthCountDecorator(AbstractText ab){
        this.abstractText = ab;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.abstractText.getText());
        sb.append("\n");
        sb.append("Quantidade de caracteres: ");
        sb.append(this.abstractText.getText().length());

        return sb.toString();
    }
}
