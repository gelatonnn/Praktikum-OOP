/**
 * Food product type
 */
public class Food extends Product {
  private String expiryDate;

  public Food(String productId, String name, double weight, String expiryDate) {
    // TODO: Instantiate Objek
  }

  public String getExpiryDate() {
    // TODO: return expiryDate
  }

  @Override
  public String getCategory() {
    return "Food";
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" [Expiry: %s]", expiryDate);
  }
}
