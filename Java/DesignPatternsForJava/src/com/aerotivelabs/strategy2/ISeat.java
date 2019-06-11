package com.aerotivelabs.strategy2;

public interface ISeat {

    String getSeatNumber();

    IPriceStrategy getPriceStrategy();
    void setPriceStrategy(IPriceStrategy strategy);
}
