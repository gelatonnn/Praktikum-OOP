import java.util.List;

// Hint: Pelajari PECS Rule
public class ZooManager {
    
    // TODO: Lengkapi tipe wildcard pada parameter
    public static void printAllAnimals(List<> animals) {
        // TODO: Loop semua animal dalam list dan tampilkan:
        // "- <animal.getInfo()> says: <animal.makeSound()>"
    }
    
    // TODO: Lengkapi tipe wildcard pada parameter
    public static void addMammals(List<> list, Mammal mammal) {
        // TODO: Tambahkan mammal ke dalam list
        // TODO: Tampilkan: "<mammal.getName()> ditambahkan ke daftar mamalia"
    }
    
    // TODO: Lengkapi tipe wildcard pada parameter
    public static int countAnimals(List<> list) {
        // TODO: Return jumlah elemen dalam list (gunakan list.size())
    }
    
    // TODO: Lengkapi tipe wildcard pada kedua parameter Enclosure
    public static void transferAnimal(Enclosure<> source, Enclosure<> destination) {
        // TODO: Ambil animal dari source menggunakan getAnimal()
        // TODO: Set animal di destination menggunakan setAnimal()
        // TODO: Tampilkan: "<animal.getName()> dipindahkan dari kandang <source.getEnclosureId()> ke <destination.getEnclosureId()>"
    }
    
    // TODO: Lengkapi tipe wildcard pada parameter
    public static void showGenericInfo(Enclosure<> enclosure) {
        // TODO: Panggil enclosure.showEnclosureInfo()
    }
}