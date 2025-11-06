import java.util.Scanner;

public class WarungKebin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        // TODO: Baca jumlah pembeli (N)
        // HINT: Perhatikan input setelah N ini

        int i = 0;
        while (i < N) {
            // TODO: Baca data pembeli (nama, nomorMeja, saldo)
            // HINT: Perhatikan input setelah data pembeli ini
            String namaPembeli = sc.nextLine();
            int nomorMeja = sc.nextInt();
            double saldo = sc.nextDouble();
            sc.nextLine();
            
            
            // TODO: Baca data order makanan (namaMakanan, jumlah, hargaSatuan)
            // HINT: Perhatikan input setelah data order makanan ini
            String namaMakanan = sc.nextLine();
            int jumlah = sc.nextInt();
            double hargaSatuan = sc.nextDouble();
            sc.nextLine();
            
            // TODO: Buat objek Pembeli dan OrderMakanan
            Pembeli pembeli = new Pembeli(namaPembeli, nomorMeja, saldo);
            OrderMakanan order = new OrderMakanan(namaMakanan, jumlah, hargaSatuan);

            // TODO: Cek apakah pembeli bisa membayar sendiri pesanannya
            boolean bisaBayar = pembeli.cekBisaBayar(order);
   
                       
            // TODO: Cetak laporan pembeli i
            if (bisaBayar){
                saldo = saldo - jumlah * hargaSatuan;
            }
            
            // TODO: Cetak laporan pembeli i
            // HINT: Jika pembeli tidak bisa membayar, tidak perlu tampilkan saldo setelah bayar
            // HINT: Perhatikan lagi format output yang diharapkan

            System.out.printf("=== Pembeli " + (i+1) + " ===\n");
            System.out.println("Nama: " + namaPembeli + " (Meja " + nomorMeja + ")");
            System.out.println("Pesanan: " + namaMakanan + " x " + jumlah + " @ " + hargaSatuan);
            System.out.println("Total: " + (jumlah * hargaSatuan));
            if (bisaBayar){
                System.out.println("Bisa Bayar: Bisa");
                System.out.println("Saldo setelah bayar: " + (saldo) + "\n");
                }
            else{
                System.out.println("Bisa Bayar: Gak Bisa\n");
            }
            i++;
        }

        sc.close();
    }
}
