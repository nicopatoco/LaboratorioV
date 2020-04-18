package edu.utn.brewery;

public class BeerConsumer extends Thread {

    private BeerHouse beerhouse;
    private String name;

    public BeerConsumer(BeerHouse beerhouse, String name) {
        this.beerhouse = beerhouse;
        this.name = name;
    }

    public void consumir() {
        beerhouse.consumeStock();
        System.out.println(name + " drank a beer in " + beerhouse.getCompanyName() + ", stock:" + beerhouse.getStock());
    }

    @Override
    public void run() {
        while (beerhouse.getStock() != 0) {
            consumir();
        }
    }

}