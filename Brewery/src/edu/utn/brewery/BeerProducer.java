package edu.utn.brewery;

public class BeerProducer implements Runnable {

    private BeerHouse beerhouse;
    private String name;

    public BeerProducer(BeerHouse beerhouse, String name) {
        this.beerhouse = beerhouse;
        this.name = name;
    }

    public void produce() {
        beerhouse.addStock();
        System.out.println(name + ", produced a beer for " + beerhouse.getCompanyName() + ", stock: " + beerhouse.getStock());
    }

    @Override
    public void run() {
        while (beerhouse.getStock() != 0) {
            produce();
        }
    }
}