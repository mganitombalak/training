package com.aerotivelabs.strategy2;

public class HighPrice extends BasePrice implements IPriceStrategy  {
    @Override
    public double calculate() {
        return getValue() * 2;
    }
}
