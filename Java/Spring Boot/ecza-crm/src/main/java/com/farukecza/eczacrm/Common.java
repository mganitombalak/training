package com.farukecza.eczacrm;

public class Common<T> {
    public T createInstance(Class<T> cls) throws IllegalAccessException, InstantiationException {
        return cls.newInstance();
    }
}
