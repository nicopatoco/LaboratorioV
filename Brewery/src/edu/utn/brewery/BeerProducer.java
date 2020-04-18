package edu.utn.brewery;

public class BeerProducer implements Runnable {

    private BeerHouse beerhouse;
    private String name;

    public BeerProducer(BeerHouse beerhouse, String name) {
        this.beerhouse = beerhouse;
        this.name = name;
    }

    @Override
    public void run() {
        while (beerhouse.getStock() != 0) {
            beerhouse.addStock(this.name);
        }
    }
}