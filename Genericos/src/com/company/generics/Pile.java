package com.company.generics;

import java.util.LinkedList;
import java.util.List;

public class Pile<T> {
    private List<T> pile;

    public Pile() {
        this.pile = new LinkedList<>();
    }

    public void push(T element) {
        pile.add(0, element);
    }

    public T pop() {
        T value = null;
        if (this.pile.size() > 0) {
            value = this.pile.get(0);
            pile.remove(0);
        } else {
            throw new RuntimeException("Empty pile");
        }
        return value;
    }

    public int size() {
        return pile.size();
    }

    public Boolean empty() {
        if (pile.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("Pile elements:" + pile);
    }

    @Override
    public String toString() {
        return "Pile{" +
                "pile=" + pile +
                '}';
    }
}
