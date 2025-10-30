// Soal 4.
// Buatlah sebuah kelas bernama Delta yang merupakan turunan dari Beta dan
// mengimplementasi interface Gamma. Kelas ini memiliki atribut tambahan d1 yang
// beripe float. Lengkapi dengan setter dan getter untuk setiap atribut yang dimiliki.
// Definisikan hanya sebuah constructor yang melakukan pengesetan terhadap nilai b1
// dan d1.

public class Delta extends Beta implements Gamma {
    private float d1;

    public Delta(Alpha b1, float d1) {
        super(b1);  
        this.d1 = d1;
    }

    @Override
    public float g1() {
        return d1;  
    }

    @Override
    public void h1(float hh1, float hh2) {
        this.d1 = hh1 + hh2;  
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }
}