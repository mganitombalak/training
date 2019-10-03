package aero.tav;

public class Person {

    private int id;
    private String name;
    private String title;

    public Person(){
        this(0);
    }

    private Person(int id){
        this.id=id;
    }

    public Person(int id, String name, String title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String getFull(){
        return this.name + " / "+ title;
    }


}
