// TODO:
// Lengkapi parameter generik dari kelas ini. 
// Perhatikan bahwa objek ini hanya bisa dibandingkan dengan objek Length lain
public class Length implements Measurable<...> {
    private final double meters;

    public Length(double meters) {
        this.meters = meters;
    }

    // TODO:
    // 1. Implementasikan fungsi getValue untuk mengembalikan nilai panjang dalam variabel yang telah disimpan.
    // 2. Implementasikan fungsi compareTo untuk membandingkan nilai panjang objek ini dengan objek lain.
    //    Gunakan Double.compare(Panjang objek ini, panjang objek lain) untuk mendapatkan hasil perbandingan.

    @Override
    public String toString() {
        return meters + " m";
    }
}
