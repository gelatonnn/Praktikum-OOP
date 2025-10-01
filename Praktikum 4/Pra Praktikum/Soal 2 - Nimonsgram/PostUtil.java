/**
 * PostUtil.java
 * 
 * Utility class untuk membandingkan engagement antar postingan.
 * Memanfaatkan interface Engageable sebagai type.
 */
public class PostUtil {

    /**
     * Membandingkan dua objek Engageable dan mengembalikan objek dengan engagement lebih tinggi.
     *
     * HINT: Manfaatkan compareEngagement dari interface Engageable tiap objeknya
     * Asumsikan bahwa a dan b adalah objek yang memiliki method compareEngagement yang sama
     * 
     * @param a objek pertama
     * @param b objek kedua
     * @return objek dengan engagement lebih tinggi (a atau b)
     */
    public static Object findHigher(Object a, Object b) {
        Engageable ea = (Engageable) a;
        Engageable eb = (Engageable) b;
        return ea.compareEngagement(eb) >= 0 ? a : b;
    }
  
    /**
     * Mengecek apakah dua objek Engageable memiliki engagement yang sama.
     *
     * HINT: Manfaatkan compareEngagement dari interface Engageable tiap objeknya
     * Asumsikan bahwa a dan b adalah objek yang memiliki method compareEngagement yang sama
     * 
     * @param a objek pertama
     * @param b objek kedua
     * @return true jika sama, false jika berbeda
     */
    public static boolean isEqual(Engageable a, Engageable b) {
        int comparisonResult = a.compareEngagement(b);
        return comparisonResult == 0;
    }
  }