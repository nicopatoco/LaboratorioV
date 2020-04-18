package edu.utn.brewery;

public class BeerHouse {

    private String companyName;
    private int capacity;
    private int stock;
    private String typeOfBeer;

    public BeerHouse(String companyName, int capacity, int stock, String typeOfBeer) {
        setCompanyName(companyName);
        setCapacity(capacity);
        setStock(stock);
        setTypeOfBeer(typeOfBeer);
    }

    public synchronized void addStock(String name) {
        try {
            while (isFull()) {
                wait();
            }
            if (getStock() != 0) {
                this.stock += 1;
                Thread.sleep(250);
                System.out.println(name + ", produced a beer for " + this.getCompanyName() + ", stock: " + this.getStock());
            }
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consumeStock(String name) {
        // In this example the tread is going to stop, because should stop when stock is 0 .
        if (this.getStock() == 0) {
            System.out.println("This thread finished");
        } else {
            this.stock -= 1;
            System.out.println(name + " drank a beer in " + this.getCompanyName() + ", stock:" + this.getStock());
        }
        notifyAll();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getStock() {
        return this.stock;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTypeOfBeer(String typeOfBeer) {
        this.typeOfBeer = typeOfBeer;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isFull() {
        return this.getStock() == this.getCapacity();
    }
}
