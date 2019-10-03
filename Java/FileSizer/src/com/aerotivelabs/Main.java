package com.aerotivelabs;

import java.io.File;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        IntSupplier supplier = () -> 5;
        IntConsumer consumer = val -> System.out.println(val);

        consumer.accept(4);

    }
}
