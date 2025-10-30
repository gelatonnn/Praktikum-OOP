/**
 * Soal No. 3:
Buatah sehuah abstract class dergan nama Vehicte yang mengimplementasi
interface Moveable. Kelas ini mempunyai properties sebuah Geol.oc bernama Ioc
(location) dan speed yang bertipe integer. Definisikan juga method getLocation
yang mengembalikan location dari Vehicle. Kelas ini mempunyai sebuah abstract
methode dengan nama accelerate dan decelerate tanpa parameter. Lengkapi
constructor kelas ini dengan parameter sebuah Geol.oc.
Tambahkan sebuah field bernama numVehicle yang akan mencacah berapa kali
getNumVehicle).
kelas tesebut dirstansas. Buatiah getter untuk getNumVehicle
 */

public abstract class Vehicle implements Moveable{
    private GeoLoc location;
    private int speed;
    private static int vehicleCount = 0;

    public Vehicle(GeoLoc location, int speed) {
        this.location = location;
        this.speed = speed;
    }

    public void setLocation(GeoLoc location) {
        this.location = location;
    }

    public GeoLoc getLocation() {
        return location;
    }

    public int getNumVehicle() {
        return vehicleCount;
    }

    public abstract void accelerate();
    public abstract void decelerate();
}