package com.aerotivelabs.strategy2;

public class Seat implements ISeat {

    private IPriceStrategy priceStrategy;
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public void setPriceStrategy(IPriceStrategy strategy) {
        this.priceStrategy = strategy;
    }

    public IPriceStrategy getPriceStrategy() {
        return priceStrategy;
    }

    public double getPrice() {
        return priceStrategy.calculate();
    }
}
