package com.br.interfaces;

public interface iObserversable {
    void add(iObserver observer);
    void remove(iObserver observer);
    void update();
}
