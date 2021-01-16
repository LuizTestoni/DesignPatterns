package com.br;

import com.br.abstracts.AbstractText;
import com.br.impl.LengthCountDecorator;
import com.br.impl.MachadoDeAssisText;
import com.br.impl.WordCountDecorator;

public class Main {

    public static void main(String[] args) {
        AbstractText originalText = new MachadoDeAssisText();

        System.out.println("Texto original: ");
        System.out.println(originalText.getText());

        System.out.println("======================================");
        System.out.println("Texto com o decorator para contar caracteres: ");
        AbstractText lenghtCountText = new LengthCountDecorator(originalText);
        System.out.println(lenghtCountText.getText());

        System.out.println("======================================");
        System.out.println("Texto com o decorator para contar palavras: ");
        AbstractText wordCountText = new WordCountDecorator(originalText);
        System.out.println(wordCountText.getText());

        System.out.println("======================================");
        System.out.println("Texto com os decorators para contar caracteres e para contar palavras: ");
        AbstractText wordAndLenghtCountText = new LengthCountDecorator(new WordCountDecorator(originalText));
        System.out.println(wordAndLenghtCountText.getText());
    }
}
