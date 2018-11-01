package com.aerotivelabs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<String> transactions = Arrays.asList("Jane,Doe,jane@doe.com,199,TR0001", "Jane,Doe,jane@doe.com,2,TR0002");
//        List<String> l = Transactions.findRejectedTransactions(transactions, 200);
//        System.out.println(l.size() +" = "+ l.get(0));

        System.out.println(DiskSpace.isWritable(1, 1, new HashSet<>()));
        System.out.println(DiskSpace.isWritable(1, 1, new HashSet<>(Arrays.asList(1))));
        System.out.println(DiskSpace.isWritable(4, 2, new HashSet<>(Arrays.asList(1, 4))));
    }
}
