public class Vehicle {
    private String plateNumber;
    private String type;
    private int capacity;   
    private int currentLoad; 
    private Driver driver;
    private Route route;

    public Vehicle(String plateNumber, String type, int capacity, Driver driver, Route route) {
        /**
        * TODO: Buatlah konstruktor untuk kelas vehicle dengan currentLoad adalah 0
        * */
        this.plateNumber = plateNumber;
        this.type = type;
        this.capacity = capacity;
        this.currentLoad = 0; 
        this.driver = driver;
        this.route = route;
    }

    public void showInfo() {
	/**
     * TODO: Tampilkan info dari vehicle
     * 		"Kendaraan: Avanza (Daihatsu)
     * 		Supir: Lina - Lisensi: ALD1122 - Rating: 3.0
     * 		Rute: Jakarta >> Tangerang (30 km)
     * 		Estimasi waktu tempuh: 0.6 jam
     * 		Penumpang: 0/7"
     * */
        System.out.println("=== Kendaraan ===");
        System.out.println("Nomor Polisi: " + plateNumber);
        System.out.println("Tipe: " + type);
        System.out.println("Kapasitas: " + currentLoad + "/" + capacity);
        if (driver != null) {
            driver.introduce();
        }
        if (route != null) {
            route.showRoute();
        }
        System.out.println("================");
    }

    public void changeDriver(Driver newDriver) {
    	/**
        * TODO: Melakukan perubahan driver di kendaraan
        * */
        this.driver = newDriver;
        System.out.println("Supir diganti menjadi: " + newDriver.getName());
    }

    public void assignRoute(Route newRoute) {
      	/**
        * TODO: Menerapkan rute baru pada  kendaraan
        * */
        this.route = newRoute;
        System.out.println("Rute diganti menjadi: " + newRoute.getInfo());
    }

    public void boardPassenger(int count) {
      	/**
        * TODO: Buatlah fungsi yang mesimulasikan penumpang yang naik ke kendaraan, 
        * 	fungsi ini akan mengubah attribut current load.
        * */
        if (currentLoad + count <= capacity) {
            currentLoad += count;
            System.out.println(count + " penumpang naik. Total: " + currentLoad);
        } else {
            System.out.println("Gagal: kapasitas tidak cukup.");
        }
    }

    public void alightPassenger(int count) {
      	/**
        * TODO: Buatlah fungsi yang mesimulasikan penumpang yang turun dari kendaraan, 
        * 	fungsi ini akan mengubah attribut current load.
        * */
        if (count <= currentLoad) {
            currentLoad -= count;
            System.out.println(count + " penumpang turun. Total: " + currentLoad);
        } else {
            System.out.println("Gagal: penumpang tidak cukup.");
        }
    }

    public Driver getDriver(){
	    return this.driver;
    }

    public int getCapacity(){
    	return this.capacity;
    }
    public void setDriver(Driver driver){
    	this.driver = driver;
    }
}
