/**
 * Soal No. 5:
Buatiah sebuah kelas bernama MainVehicle yang hanya memiliki methode main
yang melakukan instansiasi Drone dan memangil accelerate/decelerate, climb
descend, moveTo, dan cetaklah ke layar berapa kall Vehichide diastansia.i.
 */

public class MainVehicle {
    public static void main(String[] args) {
        GeoLoc initialLoc = new GeoLoc(0.0f, 0.0f, 0);
        Drone drone = new Drone(initialLoc);
        
        drone.accelerate();
        drone.decelerate();
        drone.climb();
        drone.descend();
        drone.moveTo(new GeoLoc(1.0f, 1.0f, 100));
    }
}
