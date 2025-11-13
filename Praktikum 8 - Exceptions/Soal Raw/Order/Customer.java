public class Customer {
  private String name;
  private double balance;
  private int orderCount;
  private static final int MAX_ORDERS_PER_CUSTOMER = 10;

  /**
   * Constructor
   * 
   * @param name
   * @param balance
   * @throws InvalidQuantityException jika saldo negatif, dengan pesan
   *                                  "Saldo tidak boleh negatif."
   */
  public Customer(String name, double balance) throws InvalidQuantityException {
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public int getOrderCount() {
    return orderCount;
  }

  /**
   * Menambah jumlah order untuk customer
   * 
   * @throws OrderLimitExceededException jika jumlah order melebihi batas maksimum, dengan pesan
   *                                     "Customer '<name>' telah mencapai batas maksimum order (<max_orders>)."
   */
  public void incrementOrderCount() throws OrderLimitExceededException {
  }

  /**
   * Menambahkan saldo ke customer
   * 
   * @param amount
   * @throws InvalidQuantityException jika amount negatif, dengan pesan
   *                                  "Jumlah top-up tidak boleh negatif."
   */
  public void addBalance(double amount) throws InvalidQuantityException {
  }

  /**
   * Mengurangi saldo customer
   * 
   * @param amount
   * @throws InvalidQuantityException    jika amount negatif, dengan pesan
   *                                     "Jumlah pengurangan tidak boleh negatif."
   * @throws InsufficientBalanceException jika saldo tidak mencukupi, dengan pesan
   *                                     "Saldo tidak mencukupi. Saldo: Rp<balance>, Dibutuhkan: Rp<amount>"
   */
  public void deductBalance(double amount) throws InvalidQuantityException, InsufficientBalanceException {
  }

  @Override
  public String toString() {
    return name + " - Saldo: Rp" + balance + ", Orders: " + orderCount;
  }
}
