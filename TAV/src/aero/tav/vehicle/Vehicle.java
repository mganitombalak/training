package aero.tav.vehicle;

import aero.tav.engines.VehicleEngine;

public class Vehicle {
    private VehicleEngine engine;

    public Vehicle(VehicleEngine engine) {
        this.engine = engine;
    }

    private boolean isRunning;

    public void starEngine() {
        isRunning = true;
        System.out.println("Car has been started.");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println("Car has been stopped.");
    }

    public boolean isRunning() {
        return isRunning;
    }
}