package aero.tav.engines;

public abstract class VehicleEngine implements IVehicleEngine {
    protected int stroke;

    public int getVolume() {
        return volume;
    }

    protected int volume;
    protected double oilTemp;
    protected boolean isEngineReadyToStart;
    protected boolean isRunning;
    protected EngineType engineType;
    public boolean isRunning() {
        return isRunning;
    }

    public final void stop() {
        this.isRunning = !this.isRunning ? true : false;
    }
}
