package aero.tav;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<MenuItem> appMenu;
    private static boolean isAppExited;
    private static BufferedReader consoleReader;

    private static List<Personel> personelList;
    private static List<Document> documentList;

    private static EntityManager<Personel> personelEntityManager;
    private static EntityManager<Document> documentEntityManager;

    public static void main(String[] args) throws IOException {
        Init();
        PopulateData();
        do {
            DisplayMenu(-1);
        }
        while (!isAppExited);
    }

    private static void DisplayMenu(int parentId) throws IOException {
//        for (MenuItem mn : appMenu) {
//            System.out.println(mn);
//        }
        appMenu.stream().filter(mn -> mn.getParentId() == parentId).forEach(System.out::println);
        System.out.println(parentId == -1 ? "0. Exit" : "0. Back");
        System.out.print("Choose:");
        int selectedMenu = Integer.parseInt(consoleReader.readLine());
        if (selectedMenu == 0 && parentId == -1)
            isAppExited = true;
        else {
            if (selectedMenu == 0) return;
            else if(selectedMenu!=0 && parentId!=-1){
                appMenu.stream()
                        .filter(mn->mn.getId()==selectedMenu)
                        .findFirst()
                        .ifPresent(foundMenuItem->{
                            if(foundMenuItem.getAction()!=null){
                                ((List<?>)foundMenuItem.getAction().get()).forEach(System.out::println);
                            } else if(foundMenuItem.getStringAction()!=null)
                            {
                                System.out.print("Enter Id:");
                                try {
                                    String selectedId = consoleReader.readLine();
                                    ((List<?>)foundMenuItem.getStringAction().apply(selectedId)).forEach(System.out::println);
                                } catch(Exception e){ e.printStackTrace();}
                            }
                        });
            }
            DisplayMenu(selectedMenu);
        }
    }

    private static void Init() {
        appMenu = new ArrayList<>();
        personelList = new ArrayList<>();
        documentList = new ArrayList<>();
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        personelEntityManager = new EntityManager<>(personelList);
        documentEntityManager = new EntityManager<>(documentList);
    }

    private static void PopulateData() {
        appMenu.add(new MenuItem.Builder<List<Personel>>().withId(1)
                .withDisplayOrder(1)
                .withParentId(-1)
                .withName("Personel").build());

        appMenu.add(new MenuItem.Builder().withId(11)
                .withDisplayOrder(1)
                .withParentId(1)
                .withAction(()->personelEntityManager.findAll())
                .withName("Personel Listesi").build());

        appMenu.add(new MenuItem.Builder().withId(12)
                .withDisplayOrder(2)
                .withParentId(1)
                .withStringAction(id -> personelEntityManager.findById(Integer.parseInt(id.toString())))
                .withName("ID ye göre ara").build());

        appMenu.add(new MenuItem.Builder().withId(13)
                .withDisplayOrder(3)
                .withParentId(1)
                .withName("Anahtar sözcük ile ara").build());

        appMenu.add(new MenuItem.Builder().withId(2)
                .withDisplayOrder(2)
                .withParentId(-1)
                .withName("Envanter").build());

        appMenu.add(new MenuItem.Builder().withId(21)
                .withDisplayOrder(1)
                .withParentId(2)
                .withName("Envanter Listesi").build());

        appMenu.add(new MenuItem.Builder().withId(22)
                .withDisplayOrder(2)
                .withParentId(2)
                .withName("ID ye göre ara").build());

        appMenu.add(new MenuItem.Builder().withId(23)
                .withDisplayOrder(3)
                .withParentId(2)
                .withName("Anahtar sözcük ile ara").build());

        appMenu.add(new MenuItem.Builder().withId(3)
                .withDisplayOrder(3)
                .withParentId(-1)
                .withName("Doküman").build());

        appMenu.add(new MenuItem.Builder().withId(31)
                .withDisplayOrder(1)
                .withParentId(3)
                .withName("Doküman Listesi").build());

        appMenu.add(new MenuItem.Builder().withId(32)
                .withDisplayOrder(2)
                .withParentId(3)
                .withStringAction(id -> documentEntityManager.findById(Integer.parseInt(id.toString())))
                .withName("ID ye göre ara").build());

        appMenu.add(new MenuItem.Builder().withId(33)
                .withDisplayOrder(3)
                .withParentId(3)
                .withName("Anahtar sözcük ile ara").build());


        personelList.add(new Personel(1, "Mehmet Gani", "Tombalak", "Dev"));
        personelList.add(new Personel(2, "Mehmet Ali", "Tüysüz", "Dev"));
        personelList.add(new Personel(3, "Yunus", "Çelik", "Dev"));

        documentList.add(new Document(1, "Java Programming Language", "Java Book"));
        documentList.add(new Document(2, "GDPR for Everyone", "What is GDPR? Definitive Guide"));
        documentList.add(new Document(3, "Tax Law", "Applied perspective of tax laws"));
    }
}
