package com.aerotivelabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean isAppExited = false;
    private static BufferedReader consoleReader;
    private static List<MenuItem> appMenu;
    private static EntityManager<Personel> personelEntityManager;
    private static EntityManager<InventoryItem> inventoryItemEntityManager;
    private static EntityManager<Deparment> deparmentEntityManager;

    public static void main(String[] args) throws IOException {
        final List<Personel> personelList = new ArrayList<>();
        final List<InventoryItem> inventoryItemList = new ArrayList<>();
        final List<Deparment> deparmentList = new ArrayList<>();
        appMenu = new ArrayList<>();
        populateAppData(personelList, inventoryItemList, deparmentList);

        personelEntityManager = new EntityManager<>(personelList);
        inventoryItemEntityManager = new EntityManager<>(inventoryItemList);
        deparmentEntityManager = new EntityManager<>(deparmentList);

        populateAppMenu(appMenu);
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            GenerateMenu(appMenu, -1);
        } while (!isAppExited);
    }

    private static void GenerateMenu(List<MenuItem> menu, int parentId) throws IOException {
        menu.stream().filter(m -> m.getParentId() == parentId).forEach(System.out::println);
        System.out.println(parentId == -1 ? "0. Exit" : "0. Back");
        System.out.print("Choose:");
        int selectedMenu = Integer.parseInt(consoleReader.readLine());
        if (selectedMenu == 0 && parentId == -1)
            isAppExited = true;
        else {
            if (selectedMenu == 0) return;
            else if(selectedMenu!=0 && parentId!=-1){
                menu.stream()
                        .filter(m->m.getId()==selectedMenu)
                        .findFirst()
                        .ifPresent(m->{
                            if(m.getAction()!=null)
                                ((List<?>)m.getAction().get()).forEach(System.out::println);
                            else if(m.getStringAction()!=null)
                            {
                                System.out.print("Enter Id");
                                String selectedId=null;
                                try { selectedId=consoleReader.readLine();}
                                catch (IOException e) { e.printStackTrace(); }
                                ((List<?>)m.getStringAction().apply(selectedId)).forEach(System.out::println);
                            }
                        });
            }
            GenerateMenu(menu, selectedMenu);
        }

    }

    private static void populateAppMenu(List<MenuItem> menuItems) {
        menuItems.add(new MenuItem(1, -1, 1, "Personel", null, null));
        menuItems.add(new MenuItem(11, 1, 1, "List All",personelEntityManager.findAll, null));
        menuItems.add(new MenuItem(12, 1, 2, "Find By Id", null, null));
        menuItems.add(new MenuItem(13, 1, 3, "Find By Keyword", null, personelEntityManager.findByKeyword));

        menuItems.add(new MenuItem(2, -1, 2, "Inventory", null, null));
        menuItems.add(new MenuItem(21, 2, 1, "List All", null, null));
        menuItems.add(new MenuItem(22, 2, 2, "Find By Id", null, null));
        menuItems.add(new MenuItem(23, 2, 3, "Find By Keyword", null, null));

        menuItems.add(new MenuItem(3, -1, 3, "Department", null, null));
        menuItems.add(new MenuItem(31, 3, 1, "List All", null, null));
        menuItems.add(new MenuItem(32, 3, 2, "Find By Id", null, null));
        menuItems.add(new MenuItem(33, 3, 3, "Find By Keyword", null, null));
    }

    private static void populateAppData(
            List<Personel> personels,
            List<InventoryItem> inventoryItems,
            List<Deparment> deparments) {

        //PERSONEL
        personels.add(new Personel.Builder()
                .withId(1)
                .withFirstName("Mehmet Gani")
                .withLastName("Tombalak")
                .withTitle("Dev")
                .withDepartment(1, "Software").build());

        personels.add(new Personel.Builder()
                .withId(2)
                .withFirstName("Omer Faruk")
                .withLastName("Aladag")
                .withTitle("Dev")
                .withDepartment(2, "DSS").build());

        //INVENTORY

        inventoryItems.add(new InventoryItem.Builder()
                .withId(1)
                .withName("Pen")
                .withItemType(ItemType.Stationery).build());

        inventoryItems.add(new InventoryItem.Builder()
                .withId(2)
                .withName("Ball Pen")
                .withItemType(ItemType.Stationery).build());

        inventoryItems.add(new InventoryItem.Builder()
                .withId(3)
                .withName("Scanner")
                .withItemType(ItemType.OfficeElectronics).build());

        inventoryItems.add(new InventoryItem.Builder()
                .withId(4)
                .withName("Fax")
                .withItemType(ItemType.OfficeElectronics).build());

        inventoryItems.add(new InventoryItem.Builder()
                .withId(5)
                .withName("Phone")
                .withItemType(ItemType.Electronics).build());

        inventoryItems.add(new InventoryItem.Builder()
                .withId(6)
                .withName("Water Pump")
                .withItemType(ItemType.Electronics).build());

        deparments.add(new Deparment.Builder()
                .withId(1)
                .withName("Software").build());

        deparments.add(new Deparment.Builder()
                .withId(1)
                .withName("DSS").build());


    }
}