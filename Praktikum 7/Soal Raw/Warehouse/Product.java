/**
 * Base class representing a product in the warehouse
 */
public abstract class Product {
  private String productId;
  private String name;
  private double weight; // in kg

  public Product(String productId, String name, double weight) {
    // TODO: Instantiate Objek
  }

  public String getProductId() {
    // TODO: return productId
  }

  public String getName() {
    // TODO: return name
  }

  public double getWeight() {
    // TODO: return weight
  }

  public abstract String getCategory();

  @Override
  public String toString() {
    return String.format("%s [%s] - %.2fkg", name, productId, weight);
  }
}
