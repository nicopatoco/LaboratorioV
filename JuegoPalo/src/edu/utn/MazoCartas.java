package edu.utn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MazoCartas {

    private List<String> palos;
    private List<Integer> numeros;
    private List<String> mazo;

    public MazoCartas() {
        this.palos = new ArrayList<>();
        this.numeros = new ArrayList<>();
        this.mazo = new ArrayList<>();
        this.setPalos();
        this.setNumeros();
        this.setMazo();
        this.mezclar();
    }

    private void setPalos() {
        this.palos.add("Copa");
        this.palos.add("Oro");
        this.palos.add("Basto");
        this.palos.add("Espada");
    }

    private void setNumeros() {
        for (int i = 1; i < 13; i++) {
            this.numeros.add(i);
        }
    }

    private void setMazo() {
        for (int i = 0; i < this.palos.size(); i++) {
            for (int j : this.numeros) {
                this.mazo.add(j + " de " + palos.get(i));
            }
        }
    }

    public synchronized List<String> getMazo() {
        return this.mazo;
    }

    public void mezclar() {
        Random random = new Random();
        int max, num;
        int min = 0;

        List<String> mixArray = new ArrayList<>();
        for (int i = this.mazo.size() - 1; i > -1; i--) {
            max = i;
            num = random.nextInt(max - min + 1);
            mixArray.add(this.mazo.remove(num));
        }
        this.mazo = mixArray;
    }

    public synchronized String sacarCarta() {
        if (this.getMazo().size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String carta = this.mazo.remove(0);
        notifyAll();
        return carta;
    }

    public synchronized void agregarCarta(String carta) {
        this.mazo.add(carta);
        notifyAll();
    }
}
