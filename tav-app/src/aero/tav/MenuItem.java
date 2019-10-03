package aero.tav;

import java.util.function.Function;
import java.util.function.Supplier;

public class MenuItem<T> {
    private int Id;
    private int parentId;
    private int displayOrder;
    private  String name;
    private Supplier<T> action;
    private Function<String,T> stringAction;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier<T> getAction() {
        return action;
    }

    public void setAction(Supplier<T> action) {
        this.action = action;
    }

    public Function<String, T> getStringAction() {
        return stringAction;
    }

    public void setStringAction(Function<String, T> stringAction) {
        this.stringAction = stringAction;
    }

    @Override
    public String toString() {
        return this.getId() + ". " + this.getName();
    }

    public static class Builder<T> {
        private MenuItem<T> instance;

        public Builder(){
            this.instance = new MenuItem();
        }

        public Builder withId(int id){
            this.instance.setId(id);
            return this;
        }

        public Builder withName(String name){
            this.instance.setName(name);
            return this;
        }

        public  Builder withParentId(int parentId){
            this.instance.setParentId(parentId);
            return this;
        }

        public  Builder withDisplayOrder(int displayOrder){
            this.instance.setDisplayOrder(displayOrder);
            return this;
        }

        public  Builder withAction(Supplier<T> action){
            this.instance.setAction(action);
            return this;
        }

        public  Builder withStringAction(Function<String,T> action){
            this.instance.setStringAction(action);
            return this;
        }

        public MenuItem build(){
            return instance;
        }
    }
}
