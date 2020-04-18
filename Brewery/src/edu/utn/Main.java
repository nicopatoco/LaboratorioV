package edu.utn;

import edu.utn.brewery.BeerConsumer;
import edu.utn.brewery.BeerHouse;
import edu.utn.brewery.BeerProducer;

public class Main {

    public static void main(String[] args) {
        //Brewery
        BeerHouse beerHouse1 = new BeerHouse("Antares SA.", 100, 50, "Honey");
        BeerHouse beerHouse2 = new BeerHouse("Cheverry SA.",100, 30, "AAA");

        //Producers
        Thread producer1 = new Thread(new BeerProducer(beerHouse1, "Cheverry"));
        Thread producer2 = new Thread(new BeerProducer(beerHouse2, "Antares"));

        //Consumers
        BeerConsumer consumer1 = new BeerConsumer(beerHouse1, "Pablo");
        BeerConsumer consumer2 = new BeerConsumer(beerHouse1, "German");
        BeerConsumer consumer3 = new BeerConsumer(beerHouse1, "pepe");
        BeerConsumer consumer4 = new BeerConsumer(beerHouse2, "Nico");
        BeerConsumer consumer5 = new BeerConsumer(beerHouse2, "Leo");

        //Produce Antares' beer
        producer1.start();

        //produce Cheverry's beer
        producer2.start();

        //Consume Antares' beer
        consumer1.start();
        consumer2.start();
        consumer3.start();

        // Consume Cheverry's beer
        consumer4.start();
        consumer5.start();

    }
}
