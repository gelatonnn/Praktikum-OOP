class Smartwatch implements IMobileDevice {
  private String brand;
  private String model;
  private double price;
  private boolean isOn;

  /* Konstruktor */
  public Smartwatch(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.isOn = false;
    System.out.println("Smartwatch " + brand + " " + model + " created.");
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

  @Override
  public void makeCall(String number) {
    System.out.println("Calling " + number + " from " + brand + " " + model);
  }

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending message: " + message);
  }

  @Override
  public void connectToWifi(String networkName) {
    System.out.println("Connected to " + networkName);
  }
}