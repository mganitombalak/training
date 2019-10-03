package aero.tav.engines;

public class Gasoline extends VehicleEngine {

    public Gasoline() {
        this.engineType = EngineType.Gasoline;
    }

    private void checkAndGetReady() {
        System.out.println("Checking valve positions & gas pump....");
        this.isEngineReadyToStart = true;
    }

    @Override
    public void run() {
        checkAndGetReady();
        if(isEngineReadyToStart){
            this.isRunning = true;
        }
    }
}
