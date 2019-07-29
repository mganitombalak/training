package com.aerotivelabs;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("Gani","Tombalak","Mehmet");

        l.forEach(Awesome::PrintAwesome);

    }
}
