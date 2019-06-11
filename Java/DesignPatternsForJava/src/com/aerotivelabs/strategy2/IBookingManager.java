package com.aerotivelabs.strategy2;

public interface IBookingManager {
    double getTotalSeatCount();
    double getAvaliableSeatCount();
    void BookNow(ISeat seat);
}
