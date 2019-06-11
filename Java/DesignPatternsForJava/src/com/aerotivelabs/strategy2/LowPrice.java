package com.aerotivelabs.strategy2;

public class LowPrice extends BasePrice implements IPriceStrategy {
    @Override
    public double calculate() {
        return getValue() * 1.1;
    }
}
