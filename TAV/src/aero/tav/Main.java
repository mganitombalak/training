package aero.tav;

import aero.tav.engines.VehicleEngine;
import aero.tav.vehicle.Vehicle;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        DieselEngine de = new DieselEngine();
//        VehicleEngine v = de;
//        IVehicleEngine v2 =de;
        char[][] arr = new char[5][];
        System.out.println(arr.length);

        for (int i = 5; i >= 1; i--) {
            final int finalI = i - 1;
            arr[finalI] = new char[i];
            IntStream.range(0, i).forEach(j -> {
                arr[finalI][j] = '*';
            });
        }

        //TreeSet ts = new TreeSet<VehicleEngine>(Comparator.comparingInt(VehicleEngine::getVolume));
    }
}
