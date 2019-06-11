package com.aerotivelabs.strategy2;

public class AvaragePrice extends BasePrice implements IPriceStrategy {
    @Override
    public double calculate() {
        return getValue() * 1.5;
    }
}
