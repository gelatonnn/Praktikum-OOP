import java.util.ArrayList;
import java.util.List;

public class Market {
  private String name;
  private List<Cart> carts;

  /**
   * Constructor
   * 
   * Initializes a market with a name and an empty list of carts.
   * 
   * @param name
   */
  public Market(String name) {
      this.name = name;
      this.carts = new ArrayList<>();
  }

  /**
   * Gets the name of the market.
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the list of carts associated with the market.
   * 
   * @return carts
   */
  public List<Cart> getCarts() {
    return carts;
  }

  /**
   * Adds a cart to the market.
   * 
   * Instantiate a new Cart and add it to the carts list.
   */
  public void addCart() {
    carts.add(new Cart());
  }

  /**
   * Adds a specific cart to the market.
   * 
   * @param cart
   */
  public void addCart(Cart cart) {
    carts.add(cart);
  }

  /**
   * Adds a cart with a specific item to the market.
   * 
   * Hint: Instantiate a new Cart and a new Item, add an Item to it, then add the
   * Cart to the carts list.
   * 
   * @param itemName
   * @param itemPrice
   */
  public void addCartWithItem(String itemName, double itemPrice) {
    Cart cart = new Cart();
    cart.addItem(itemName, itemPrice);
    carts.add(cart);
}

  /**
   * Removes a cart from the market.
   * 
   * @param cart
   */
  public void removeCart(Cart cart) {
    carts.remove(cart);
  }

  /**
   * Clears all carts from the market.
   * 
   * Hint: gunakan clear
   */
  public void clearCarts() {
    carts.clear();
  }

  /**
   * Checks out all carts in the market and prints the total amount for each cart.
   * 
   * Hint:
   * - gunakan method checkout pada Cart
   * - gunakan printf untuk format output
   * - Format: "Total amount for cart %d: Rp %.0f%n"
   * "Grand total for all carts: Rp %.0f%n"
   * 
   * 
   * Output:
   * Checking out all carts in market: [market name]
   * Total amount for cart [cartId]: Rp [total amount]
   * ...
   * Total amount for cart [cartId]: Rp [total amount]
   * Grand total for all carts: Rp [grand total amount]
   */
  public void checkoutAllCarts() {
    System.out.println("Checking out all carts in market: " + name);
    double grandTotal = 0;
    for (Cart cart : carts) {
        double totalAmount = cart.checkout();
        System.out.printf("Total amount for cart %d: Rp %.0f%n", cart.getCartId(), totalAmount);
        grandTotal += totalAmount;
    }
    System.out.printf("Grand total for all carts: Rp %.0f%n", grandTotal);
  }

  /**
   * Nested Static Class: Cart
   * 
   * Represents a shopping cart that can hold multiple items.
   */
  public static class Cart {
    public static int cartCounter = 0;
    private int cartId;
    private List<Item> items;

    /**
     * Constructor
     * 
     * Initializes an empty shopping cart.
     * Creates a new cart with a unique ID (Incremental).
     */
    public Cart() {
        this.cartId = ++cartCounter;
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the cart.
     * 
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Adds an item to the cart by specifying its name and price.
     * 
     * @param name
     * @param price
     */
    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    /**
     * Removes an item from the cart.
     * 
     * @param item
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Removes an item from the cart by its unique ID.
     * 
     * Hint: gunakan removeIf
     * 
     * @param id
     */
    public void removeItemById(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    /**
     * Clears all items from the cart.
     * 
     * Hint: gunakan clear
     */
    public void clearCart() {
        items.clear();
    }

    /**
     * Calculates the total price of all items in the cart and clears the cart.
     * 
     * @return total price
     */
    public double checkout() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        clearCart();
        return total;
    }

    /**
     * Gets the unique ID of the cart.
     * 
     * @return cartId
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * Nested Static Class: Item
     * 
     * Represents an item that can be added to a cart.
     */
    public static class Item {
      private static int idCounter = 0;
      private int id;
      private String name;
      private double price;

      /**
       * Constructor
       * 
       * Creates a new item with a unique ID (Incremental), name, and price.
       * 
       * @param name
       * @param price
       */
      public Item(String name, double price) {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
      }

      /**
       * Gets the unique ID of the item.
       * 
       * @return id
       */
      public int getId() {
        return id;
      }

      /**
       * Gets the name of the item.
       * 
       * @return name
       */
      public String getName() {
        return name;
      }

      /**
       * Gets the price of the item.
       * 
       * @return price
       */
      public double getPrice() {
        return price;
      }
    }
  }
}