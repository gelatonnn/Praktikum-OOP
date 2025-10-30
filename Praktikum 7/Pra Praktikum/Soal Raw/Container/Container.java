import java.util.ArrayList;
import java.util.List;

// TODO: Buat generic class Container<T>
// Pertanyaan: Mengapa kita menggunakan generic class?
// Hint: Coba bayangkan jika Anda harus membuat ContainerInteger, ContainerString, ContainerDouble.
//       Apakah ada pola yang berulang? Konsep pemrograman apa yang menghindari pengulangan kode?
//
// Pertanyaan: Apa keuntungan menggunakan <T> dibanding menggunakan Object?
// Hint: Kapan error tipe data akan terdeteksi? Apa yang terjadi jika ada kesalahan cast?
//
// Atribut yang diperlukan:
// - List<T> items untuk menyimpan data
// - String name untuk nama container
//
// Method yang diperlukan:
// - Constructor(String name): inisialisasi container dengan nama
//   * Pertanyaan: Bagaimana cara menginisialisasi List<T>? ArrayList atau LinkedList?
//
// - add(T item): menambahkan item ke container
//   * Tampilkan: "Item ditambahkan ke [name]"
//   * Hint: Eksplorasi dokumentasi List interface. Method apa yang menambahkan elemen?
//
// - get(int index): mengambil item pada index tertentu
//   * Return item pada index, atau null jika index tidak valid
//   * Hint: Pikirkan batas bawah dan atas index yang valid untuk sebuah list.
//
// - size(): return jumlah item dalam container
//   * Hint: Bagaimana cara mengetahui berapa banyak elemen dalam sebuah koleksi?
//
// - getName(): return nama container
//
// - getItems(): return List<T> items
//   * Pertanyaan: Apakah aman return reference langsung atau perlu copy?
//   * Hint: Untuk praktikum ini, return reference langsung sudah cukup
//
// - display(): menampilkan semua item
//   * Format: "Container [name] berisi [size] item:"
//   * Lalu tampilkan setiap item dengan format: "- [item]"
//   * Hint: Ada beberapa cara untuk mengiterasi koleksi. Pertimbangkan readability kode Anda.

public class Container {
    // TODO: Implementasikan class ini
    // Jangan lupa tambahkan <T> setelah nama class!
}
