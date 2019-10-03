package aero.tav;

import java.util.List;

public class Squared implements Runnable {
    List<Double> initals;

    public Squared(List<Double> initals) {
        this.initals = initals;
    }

    @Override
    public void run() {
        this.initals.replaceAll(i->Math.pow(i,2));
    }
}
