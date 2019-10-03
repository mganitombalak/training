package aero.tav.engines;

public enum EngineType {

    Diesel("Diesel Engine"),
    Gasoline ("Gasoline Engine");

    EngineType(String desc){
        this.description=desc;
    }
    private String description;
    public String getDescription() {
        return description;
    }
}
