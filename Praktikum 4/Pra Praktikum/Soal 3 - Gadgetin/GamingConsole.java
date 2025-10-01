class GamingConsole implements IGadget {
  private String brand;
  private String model;
  private double price;
  private boolean isOn;

  /* Konstruktor */
  public GamingConsole(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.isOn = false;
    System.out.println("Gaming Console " + brand + " " + model + " created.");
  }

  @Override
  public void turnOn() {
    isOn = true;
    System.out.println(brand + " " + model + " is now ON");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println(brand + " " + model + " is now OFF");
  }

  @Override
  public String getInfo() {
    String status = isOn ? "[ON]" : "[OFF]";
    return status + " " + brand + " " + model + " - Rp " + (long)price;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  // Gaming Console specific method
  /**
   * Memainkan game pada konsol
   * Menampilkan pesan "Playing [gameName] on [brand] [model]"
   * 
   * @param gameName
   */
  public void playGame(String gameName) {
    System.out.println("Playing " + gameName + " on " + brand + " " + model);
  }
}