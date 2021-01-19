package com.br;

import com.br.impl.EnglishBookFactory;
import com.br.impl.PortugueseBookFactory;
import com.br.interfaces.iText;
import com.br.interfaces.iTitle;
import com.br.module.EnglishText;

public class Main {

    public static void main(String[] args) {
        EnglishBookFactory englishBookFactory = new EnglishBookFactory();
        iTitle englishTitle = englishBookFactory.getTitle("Manifesto of the Communist Party");
        iText englishText = englishBookFactory.getText("A spectre is haunting Europe — the spectre of communism. All the powers of old Europe have entered into a holy alliance to exorcise this spectre: Pope and Tsar, Metternich and Guizot, French Radicals and German police-spies.");

        System.out.println("English Book Factory result instances:");
        System.out.println(englishTitle.getTitle());
        System.out.println(englishText.getText());

        System.out.println("===========================");

        PortugueseBookFactory portugueseBookFactory = new PortugueseBookFactory();
        iTitle portugueseTitle = portugueseBookFactory.getTitle("Manifesto do Partido Comunista");
        iText portugueseText = portugueseBookFactory.getText("Anda um espectro pela Europa — o espectro do Comunismo. Todos os poderes da velha Europa se aliaram para uma santa caçada a este espectro, o papa e o tsar, Metternich e Guizot, radicais franceses e polícias alemães.");

        System.out.println("Portuguese Book Factory result instances:");
        System.out.println(portugueseTitle.getTitle());
        System.out.println(portugueseText.getText());
    }
}
