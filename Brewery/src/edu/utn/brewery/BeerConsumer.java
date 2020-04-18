package edu.utn.brewery;

public class BeerConsumer extends Thread {

    private BeerHouse beerhouse;
    private String name;

    public BeerConsumer(BeerHouse beerhouse, String name) {
        this.beerhouse = beerhouse;
        this.name = name;
    }

    @Override
    public void run() {
        while (beerhouse.getStock() != 0) {
            beerhouse.consumeStock(this.name);
        }
        System.out.println(this.name + ": Tread finished");
    }

}