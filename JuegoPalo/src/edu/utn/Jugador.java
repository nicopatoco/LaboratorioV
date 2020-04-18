package edu.utn;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Thread {

    private String nombre;
    private String palo;
    private List<String> cartas;
    private MazoCartas mazo;

    public Jugador(String nombre, MazoCartas mazo, String palo) {
        this.nombre = nombre;
        this.cartas = new ArrayList<>();
        this.mazo = mazo;
        this.palo = palo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getCartas() {
        return cartas;
    }

    public void setCarta(String carta) {
        this.cartas.add(0, carta);
        if (this.cartas.size() == 12) {
            System.out.println("termino: " + this.getNombre() + " " + this.cartas);
        }
    }

    public int getNum(String cadena) {
        Boolean flag = false;
        int num;
        if (cadena.charAt(1) == ' ') {
            num = Integer.parseInt(cadena.substring(0, 1));
        } else {
            num = Integer.parseInt(cadena.substring(0, 2));
        }
        return num;
    }

    public void run() {
        String carta;
        while (this.cartas.size() < 12) {
            carta = mazo.sacarCarta();
            if (carta != null){
                if (carta.contains(this.palo)) {
                    if (cartas.size() == 0 && getNum(carta) == 1 || cartas.size() > 0 && getNum(cartas.get(0)) + 1 == getNum(carta)) {
                        this.setCarta(carta);
                    } else {
                        mazo.agregarCarta(carta);
                    }
                } else {
                    mazo.agregarCarta(carta);
                }
            }
        }
    }
}
