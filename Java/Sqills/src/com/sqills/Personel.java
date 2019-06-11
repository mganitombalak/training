package com.sqills;

public class Personel extends Common {
    public static class Builder {

        private Personel personel;

        public Builder() {
            this.personel = new Personel();
        }

        public Builder WithId(int Id) {
            personel.setId(Id);
            return this;
        }

        public Builder WithName(String name) {
            personel.setName(name);
            return this;
        }

        public Builder WithDesc(String desc) {
            personel.setDesc(desc);
            return this;
        }

        public Personel build() {
            return personel;
        }
    }

    @Override
    public String toString() {
        return this.getId() +"."+ getName() +" "+ getDesc() ;
    }
}
