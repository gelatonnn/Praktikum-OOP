/**
 * Soal 1.
Buatlah kelas dengan nama Alpha. Kelas ini mempunyai 2 buah atribut yaitu a1 dan
a2 yang bertipe float. Kelas ini mempunyai sebuah konstruktor berparameter a1
dan a2 bertipe float yang nilainya dijadikan inisialisasi nilai atribut kelas ini. Kelas ini
juga memiliki sebuah method bernama f1 dengan parameter aal dan aa2 bertipe
float. Pada method f1 dilakukan penjumlahan a1 dan a2 dengan aa1 dan aa2.
Lengkapi juga setter dan getter agar aspek information hiding terpenuhi.
 */

public class Alpha {
    float a1;
    float a2;

    public Alpha(float a1, float a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    
    public void f1(float aa1, float aa2) {
        float sum = (a1 + a2) + (aa1 + aa2);
        this.a1 = sum;
    }
    
    public float a1() {
        return a1;
    }

    public float a2() {
        return a2;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }
    
}