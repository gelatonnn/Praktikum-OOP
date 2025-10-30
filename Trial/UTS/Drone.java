/**
 * Soal No. 4:
Buatlah sebuah kelas bernama Drone yang merupakan turunan dari Vehicle dan
mengimplementasi intertace Moveable. Nelas ini memilibuz tambahan vige
yang beripe integer. Definiskan hanya sebuah constructor yang melakukan
pengesetan terhadap nilai location.
Buatiah method dengan nama climb dan descend yang menambah/mengurangi
altitude sebanyak 1 satuan.
 */

public class Drone extends Vehicle implements Moveable {
    private int vSpeed;  // vertical speed
    
    public Drone(GeoLoc location) {
        super(location);
        this.vSpeed = 0;
    }
    
    public void climb() {
        GeoLoc current = getLocation();
        current.setAlt(current.getAlt() + vSpeed);
    }
    
    public void descend() {
        GeoLoc current = getLocation();
        current.setAlt(current.getAlt() - vSpeed);
    }
    
    @Override
    public void accelerate() {
        // Implement acceleration logic
    }
    
    @Override
    public void decelerate() {
        // Implement deceleration logic
    }
    
    @Override
    public GeoLoc moveTo(GeoLoc newLoc) {
        setLocation(newLoc);
        return getLocation();
    }
}

