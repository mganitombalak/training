package com.aerotivelabs.strategy2;

public class VeryHighPrice extends BasePrice implements IPriceStrategy  {
    @Override
    public double calculate() {
        return getValue() * 4;
    }
}
