package com.aerotivelabs.strategy2;

public class PriceStrategyManager {

    private IBookingManager bookingManager;

    public PriceStrategyManager(IBookingManager bookingManager) {
        this.bookingManager = bookingManager;
    }

    public void Identify(ISeat seat) {
        double ratio = (bookingManager.getAvaliableSeatCount() / bookingManager.getTotalSeatCount()) * 100d;
        if (ratio > 90d) {
            seat.setPriceStrategy(new LowPrice());
        } else if (ratio < 90 && ratio > 60) {
            seat.setPriceStrategy(new AvaragePrice());
        } else if (ratio < 60 && ratio > 30) {
            seat.setPriceStrategy(new HighPrice());
        } else {
            seat.setPriceStrategy(new VeryHighPrice());
        }

    }
}
