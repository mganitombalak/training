package com.sqills;

public class Equipment extends Common {
    public static class Builder {

        private Equipment equipment;

        public Builder() {
            this.equipment = new Equipment();
        }

        public Builder WithId(int Id) {
            equipment.setId(Id);
            return this;
        }

        public Builder WithName(String name) {
            equipment.setName(name);
            return this;
        }

        public Builder WithDesc(String desc) {
            equipment.setDesc(desc);
            return this;
        }

        public Equipment build() {
            return equipment;
        }
    }

    @Override
    public String toString() {
        return this.getId() +"."+ getName() +" "+ getDesc() ;
    }
}
