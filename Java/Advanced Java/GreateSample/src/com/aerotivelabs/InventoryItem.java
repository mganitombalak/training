package com.aerotivelabs;

public class InventoryItem implements IEntity<Integer>{

    private int id;
    private String name;
    private ItemType itemType;

    private InventoryItem() { }

    public InventoryItem(int id, String name, ItemType itemType) {
        this.id = id;
        this.name = name;
        this.itemType = itemType;
    }

    public Integer getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    private void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itemType=" + itemType.getDesciption() +
                '}';
    }

    public static class Builder{
        private InventoryItem instance;

        public Builder() {
            this.instance=new InventoryItem();
        }

        public Builder withId(int id){
            this.instance.setId(id);
            return this;
        }

        public Builder withName(String name){
            this.instance.setName(name);
            return this;
        }

        public Builder withItemType(ItemType type){
            this.instance.setItemType(type);
            return this;
        }

        public InventoryItem build() {
            return instance;
        }
    }
}
