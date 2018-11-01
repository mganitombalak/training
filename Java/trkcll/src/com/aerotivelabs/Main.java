package com.aerotivelabs;

import com.aerotivelabs.entity.Equipment;
import com.aerotivelabs.entity.MenuItem;
import com.aerotivelabs.entity.Person;
import com.aerotivelabs.entity.Vehicle;
import com.aerotivelabs.manager.DataManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static List<MenuItem> menuItems;
    private static BufferedReader consoleReader;
    private static boolean isAppExited = false;

    private static List<Person> personList;
    private static List<Equipment> equipmentList;
    private static List<Vehicle> vehicleList;

    private static DataManager<Person> personDataManager;
    private static DataManager<Vehicle> vehicleDataManager;
    private static DataManager<Equipment> equipmentDataManager;

    public static void main(String[] args) throws IOException {
        init();
        do {
            generateMenu(-1);
        } while (!isAppExited);
    }


    private static void init() {
        menuItems = new ArrayList<>();
        populateMenuItems(menuItems);
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        personList = new ArrayList<>();
        equipmentList = new ArrayList<>();
        vehicleList = new ArrayList<>();

        populateAppData();

        personDataManager = new DataManager<>(personList);
        vehicleDataManager = new DataManager<>(vehicleList);
        equipmentDataManager = new DataManager<>(equipmentList);
    }

    private static void populateMenuItems(List<MenuItem> menuTree) {
        menuTree.add(new MenuItem(1, -1, 1, "Kisiler", null,null));

        menuTree.add(new MenuItem<List<Person>>(11, 1, 1, "Listele",
                () -> personDataManager.getAll(),personDataManager.findByKeyword));
        menuTree.add(new MenuItem(12, 1, 2, "Isme Gore Arama",null,null));
        menuTree.add(new MenuItem(13, 1, 3, "ID'ye Gore Arama", null,null));

        menuTree.add(new MenuItem(2, -1, 2, "Ekipmanlar", null,null));
        menuTree.add(new MenuItem(21, 2, 1, "Listele",
                () -> equipmentDataManager.getAll(),null));
        menuTree.add(new MenuItem(22, 2, 2, "Isme Gore Arama", null,null));
        menuTree.add(new MenuItem(23, 2, 3, "ID'ye Gore Arama", null,null));

        menuTree.add(new MenuItem(3, -1, 3, "Araclar", null,null));
        menuTree.add(new MenuItem(31, 3, 1, "Listele",
                () -> vehicleDataManager.getAll(),null));
        menuTree.add(new MenuItem(32, 3, 2, "Isme Gore Arama", null,null));
        menuTree.add(new MenuItem(33, 3, 3, "ID'ye Gore Arama", null,null));

    }

    private static void generateMenu(int parentId) throws IOException {
        menuItems.stream()
                .filter(mi -> mi.getParentId() == parentId)
                .sorted(Comparator.comparingInt(MenuItem::getDisplayOrder))
                .forEach(MenuItem::Display);

        System.out.println(parentId == -1 ? "0) Exit" : "0) Back");
        System.out.print("Secim:");
        int selectedMenu = Integer.parseInt(consoleReader.readLine());
        if (selectedMenu == 0 && parentId == -1)
            isAppExited = true;
        else {
            if (selectedMenu == 0) return;
            else if (selectedMenu != 0 && parentId != -1) {
                menuItems.stream()
                        .filter(mi -> mi.getId() == selectedMenu)
                        .findFirst()
                        .ifPresent(mi -> {

                            if (mi.getAction() != null) {
                                ((List<?>) mi.getAction().get()).stream().forEach(System.out::println);
                            } else if(mi.getFaction()!=null){
                                System.out.print("Enter keyword:");
                                String keyword = null;
                                try {
                                    keyword = consoleReader.readLine();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                ((List<?>)mi.getFaction().apply(keyword)).forEach(System.out::println);
                            }
                        });

            }
            generateMenu(selectedMenu);
        }
    }

    private static void populateAppData() {
        personList.add(new Person(1, "Mehmet Gani", "Tombalak", 'f', "Dev"));
        personList.add(new Person(2, "Hakan", "Yildiz", 'm', "Dev"));
        personList.add(new Person(3, "Ahmet", "Kapusuz", 'm', "Dev"));

        equipmentList.add(new Equipment(1, "Cekic", 1, 10.40d));
        equipmentList.add(new Equipment(2, "Pense", 2, 5.30d));
        equipmentList.add(new Equipment(3, "Tornavida", 1, 3.50d));
        equipmentList.add(new Equipment(4, "Kargaburnu", 3, 8.90d));
        equipmentList.add(new Equipment(5, "Ingiliz Anahtari", 4, 17.10d));
        equipmentList.add(new Equipment(6, "Boru Anahtari", 2, 39.50d));

        vehicleList.add(new Vehicle(1, "Volvo", "V40", 2014, "34ABC34"));
        vehicleList.add(new Vehicle(2, "Volkswagen", "Polo", 2015, "34DEF34"));
        vehicleList.add(new Vehicle(3, "Renault", "Megane", 2011, "34GHI34"));
        vehicleList.add(new Vehicle(4, "BMW", "530d", 2018, "34XYZ34"));
        vehicleList.add(new Vehicle(5, "Mercedes", "E220d-AMG", 2018, "34KLM34"));
    }
}
