public class CafeApp {
    public static void main(String[] args) {
        
        // 1. Pesanan: Kopi + Susu + Gula
        Coffee pesanan = new Sugar( new Milk( new SimpleCoffee() ) );

        System.out.println("Menu: " + pesanan.getDescription());
        System.out.println("Total: Rp " + pesanan.getCost());
        
        // Output:
        // Menu: Kopi Hitam, Susu, Gula
        // Total: Rp 14.000
    }
}