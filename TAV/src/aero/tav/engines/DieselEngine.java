package aero.tav.engines;

public class DieselEngine extends VehicleEngine{
    private double injectorTemp;

    public DieselEngine() {
        this.engineType = EngineType.Diesel;
    }

    private void checkAndGetReady() {
        System.out.println("Injectors are ok.Heating started...");
        while (injectorTemp < 1000) {
            injectorTemp++;
        }
        this.isEngineReadyToStart = true;
    }

    @Override
    public void run() {
        checkAndGetReady();
        if (isEngineReadyToStart) {
            this.isRunning = true;
        }
    }
}
