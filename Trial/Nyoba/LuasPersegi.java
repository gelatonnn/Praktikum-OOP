import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        // Input panjang dan lebar
        System.out.print("Masukkan panjang: ");
        int panjang = abc.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = abc.nextInt();

        // Proses hitung
        int luas = panjang * lebar;

        // Output hasil
        System.out.println("Luas persegi panjang adalah: " + luas);

        abc.close();
    }
}
    

