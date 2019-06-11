package com.aerotivelabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DataManager<T extends IEntity> {

    private List<T> data;
    private BufferedReader consoleReader;

    public DataManager(List<T> data, BufferedReader reader) {
        this.data = data;
        this.consoleReader = reader;
    }

    public Supplier<List<T>> findAll() {
        return () -> data;
    }

    public Supplier<List<T>> findById() {
        return () ->
        {
            System.out.print("Enter Id: ");
            try {
                int id = Integer.parseInt(consoleReader.readLine());
                return data.stream().filter(item -> item.getId() == id).collect(Collectors.toList());
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        };
    }

    public Supplier<List<T>> findyByKeyword() {
        return ()-> {
            System.out.print("Enter keyword: ");
            try {
                String keyword = consoleReader.readLine();
                return data.stream().filter(item -> item.toString().contains(keyword)).collect(Collectors.toList());
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        };
    }
}
