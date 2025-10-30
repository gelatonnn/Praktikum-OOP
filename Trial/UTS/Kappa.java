// Soal 5.
// Buatlah sebuah kelas bernama Kappa yang merupakan turunan dari Delta dan
// mengimplementasi interface Gamma. Di dalammya punya atribut k1 yang bertipe
// float. Lengkapi dengan setter dan getter untuk setiap atribut yang dimiliki.
// Definisikan hanya sebuah constructor yang melakukan pengesetan terhadap nilai b1,
// d1, dan juga k1. Tambahkan methode main yang melakukan instansiasi Kappa dan
// melakukan g1, h1, dan cetaklah ke layar berapa kali Beta diinstansiasi.

public class Kappa extends Delta implements Gamma {
    private float k1;

    public Kappa(Alpha b1, float d1, float k1) {
        super(b1, d1); 
        this.k1 = k1;
    }

    @Override
    public float g1() {
        return k1; 
    }

    @Override
    public void h1(float hh1, float hh2) {
        this.k1 = hh1 * hh2;
    }
    
    public float getK1() {
        return k1;
    }

    public void setK1(float k1) {
        this.k1 = k1;
    }

    public static void main(String[] args) {
        Alpha alpha = new Alpha(1.0f, 2.0f);
        
        Kappa kappa = new Kappa(alpha, 3.0f, 4.0f);
        
        System.out.println("g1() result: " + kappa.g1());
        
        kappa.h1(5.0f, 6.0f);
        System.out.println("After h1(), k1 = " + kappa.getK1());
        
        System.out.println("Number of Beta instances: " + Beta.getCountBeta());
    }
}