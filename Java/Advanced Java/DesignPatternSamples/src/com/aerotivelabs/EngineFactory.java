package com.aerotivelabs;

public class EngineFactory {
    public static Engine CreateEngine(int stroke){
        return stroke%2==1? new DieselEngine():new GasolineEngine();
    }
}