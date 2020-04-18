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

    public synchronized void addStock() {
        while (this.isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock += 1;
        notifyAll();
    }

    public synchronized void consumeStock() {
        while (this.getStock() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock -= 1;
        notifyAll();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getStock() {
        return this.stock;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCompanyName() {
        return companyName;
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
        return this.getStock() >= this.getCapacity();
    }
}
