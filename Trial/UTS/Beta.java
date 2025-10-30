/**
 * Buatlah sebuah abstract class dengan nama Beta. Beta mempunyai sebuah
abstract methode dengan nama g1 yang menghasilkan sebuah nilai float hasil
kalkulasi atribut kelas tersebut. Kelas ini mempunyai properties sebuah Alpha
bernama b1. Definisikan method set_b1 dengan sebuah parameter bertipe Alpha
dengan nama bb1. Definisikan juga method get b1 yang mengembalikan sebuah
Alpha. Lengkapi dengan constructor-nya dengan parameter sebuah Alpha.
Tambahkan sebuah field bernama countBeta yang akan mencacah berapa kall kelas
tersebut diinstansiasi. Buatlah getter untuk countBeta tsb (beri nama
getCountBeta).
 */

public abstract class Beta {
    private Alpha b1;
    private static int countBeta = 0;

    public Beta(Alpha b1) {
        this.b1 = b1;
        countBeta++;
    }

    public abstract float g1();

    public void set_b1(Alpha bb1) {
        this.b1 = bb1;
    }

    public Alpha get_b1() {
        return b1;
    }

    public static int getCountBeta() {
        return countBeta;
    }
}