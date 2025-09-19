public class Dokter {
    private static int jumlahDokter = 0;
    private static int MAX_PASIEN = 3;

    private String kodeDokter;
    private DataPribadi dataPribadi;
    private String spesialisasi;
    private int jumlahPasien;
    private boolean sedangBertugas;
    private double tarif;

    // TODO 1: Buat constructor yang menerima DataPribadi dan spesialisasi
    public Dokter(DataPribadi dataPribadi, String spesialisasi) {
        // TODO 1a: Tambahkan jumlahDokter
        jumlahDokter++;

        // TODO 1b: Generate kodeDokter menggunakan format "DR001", "DR002", dst.
        // Petunjuk: Gunakan String.format("%03d", jumlahDokter) untuk mendapat angka 3 digit dengan leading zeros
        this.kodeDokter = "DR" + String.format("%03d", jumlahDokter);

        // TODO 1c: Inisialisasi semua variabel instance
        this.dataPribadi = dataPribadi;
        this.spesialisasi = spesialisasi;
        this.jumlahPasien = 0;
        this.sedangBertugas = false;

        // TODO 1d: Hitung tarif berdasarkan spesialisasi
        // Umum: 100000, Jantung: 300000, Anak: 200000
        // Petunjuk: Gunakan if-else statements atau ternary operator
        if (spesialisasi.equalsIgnoreCase("Umum")) {
            this.tarif = 100000;
        } else if (spesialisasi.equalsIgnoreCase("Jantung")) {
            this.tarif = 300000;
        } else if (spesialisasi.equalsIgnoreCase("Anak")) {
            this.tarif = 200000;
        } else {
            this.tarif = 150000; // default
        }

        // TODO 1e: Tambahkan bonus pengalaman berdasarkan umur
        // Bonus = ((umur - 25) / 5) * 50000
        // Petunjuk: Gunakan integer division untuk mendapat bilangan bulat saja
        int bonus = ((dataPribadi.getUmur() - 25) / 5) * 50000;
        if (bonus > 0) {
            this.tarif += bonus;
        }
    }

    // TODO 2: Buat method mulaiShift()
    // Mengembalikan true jika berhasil memulai shift, false jika sudah bertugas
    public boolean mulaiShift() {
        if (sedangBertugas) {
            return false;
        } else {
            sedangBertugas = true;
            return true;
        }
    }

    // TODO 3: Buat method tambahPasien()
    // Mengembalikan true jika berhasil menambah pasien, false jika tidak bertugas atau sudah maksimal
    public boolean tambahPasien() {
        if (!sedangBertugas || jumlahPasien >= MAX_PASIEN) {
            return false;
        } else {
            jumlahPasien++;
            return true;
        }
    }

    // TODO 4: Buat method decrementPasien() untuk mengurangi jumlah pasien
    // Petunjuk: Hanya kurangi jika jumlahPasien > 0
    public void decrementPasien() {
        if (jumlahPasien > 0) {
            jumlahPasien--;
        }
    }

    // TODO 5: Buat static getter untuk jumlahDokter
    public static int getJumlahDokter() {
        return jumlahDokter;
    }

    // TODO 6: Override method toString()
    // Format: "kodeDokter - nama (spesialisasi) - Pasien: current/max"
    // Contoh: "DR001 - Dr. Budi (Umum) - Pasien: 2/3"
    public String toString() {
        return kodeDokter + " - " + dataPribadi.toString() + " (" + spesialisasi + ") - Pasien: " + jumlahPasien + "/" + MAX_PASIEN;
    }

    // TODO 7: Buat method getter untuk semua atribut private
    public String getSpesialisasi() {
        return spesialisasi;
    }

    public boolean isSedangBertugas() {
        return sedangBertugas;
    }

    public int getJumlahPasien() {
        return jumlahPasien;
    }

    public double getTarif() {
        return tarif;
    }

    public DataPribadi getDataPribadi() {
        return dataPribadi;
    }
}