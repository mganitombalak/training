package com.sqills;

public class Inventory extends Common {
    public static class Builder {

        private Inventory inventory;

        public Builder() {
            this.inventory = new Inventory();
        }

        public Builder WithId(int Id) {
            inventory.setId(Id);
            return this;
        }

        public Builder WithName(String name) {
            inventory.setName(name);
            return this;
        }

        public Builder WithDesc(String desc) {
            inventory.setDesc(desc);
            return this;
        }

        public Inventory build() {
            return inventory;
        }
    }

    @Override
    public String toString() {
        return this.getId() +"."+ getName() +" "+ getDesc() ;
    }
}
