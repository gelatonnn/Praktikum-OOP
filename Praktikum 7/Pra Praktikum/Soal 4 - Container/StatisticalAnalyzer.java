import java.util.ArrayList;
import java.util.List;

// TODO: Buat class StatisticalAnalyzer (standalone class)
public class StatisticalAnalyzer {
    // TODO: Implementasikan class ini

    // Atribut yang diperlukan:
    // - String analyzerName
    private String analyzerName;

    // Method yang diperlukan:
    // - Constructor(String name): inisialisasi analyzer
    public StatisticalAnalyzer(String name) {
        this.analyzerName = name;
    }

    // - getAnalyzerName(): return nama analyzer
    public String getAnalyzerName() {
        return analyzerName;
    }

    // - calculateAverage(Container<? extends Number> container): hitung rata-rata
    //   * Pertanyaan: Mengapa kita menggunakan wildcard "? extends Number"?
    //   * Hint: Apa hubungan antara Integer, Double, Float dengan Number?
    //           Jika method menerima Container<Number>, bisakah kita pass Container<Integer>?
    //   * Tampilkan: "Menghitung rata-rata dari [container.getName()]..."
    //   * Return rata-rata sebagai double, atau 0.0 jika kosong
    //   * Hint: Bagaimana cara mengkonversi berbagai tipe Number menjadi double?    
    public double calculateAverage(Container<? extends Number> container) {
        System.out.println("Menghitung rata-rata dari " + container.getName() + "...");
        double avg = 0.0;
        
        if (container.size() > 0) {
            double sum = 0.0;
            for (int i = 0; i < container.size(); i++) {
                sum += container.get(i).doubleValue();
            }
            avg = sum / container.size();
        }
        return avg;
    }

    // - calculateSum(Container<? extends Number> container): hitung total
    //   * Tampilkan: "Menghitung total dari [container.getName()]... (tanpa [])"
    //   * Return sum sebagai double    
    public double calculateSum(Container<? extends Number> container) {
        System.out.println("Menghitung total dari " + container.getName() + "...");
        double sum = 0.0;

        for (int i = 0; i < container.size(); i++) {
            sum += container.get(i).doubleValue();
        }
        return sum;
    }

    // - findAboveThreshold(Container<? extends Number> container, double threshold)
    //   * Tampilkan: "Mencari nilai di atas threshold [threshold] di [container.getName()]..."
    //   * Return List<Number> berisi semua nilai yang lebih besar dari threshold
    //   * Hint: Pikirkan cara membandingkan Number dengan double.    
    public List<Number> findAboveThreshold(Container<? extends Number> container, double threshold) {
        System.out.println("Mencari nilai di atas threshold " + threshold + " di " + container.getName() + "...");
        List<Number> result = new ArrayList<Number>();

        for (int i = 0; i < container.size(); i++) {
            Number num = container.get(i);
            if (num.doubleValue() > threshold) {
                result.add(num);
            }
        }
        return result;
    }
}
