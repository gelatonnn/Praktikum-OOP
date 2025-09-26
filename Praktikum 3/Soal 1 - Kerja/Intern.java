public class Intern extends Employee {
    // TODO: Buat atribut private int duration, String university
    private int duration;
    private String university;

    // TODO: Buat constructor yang menerima name, salary, duration, university
    // Gunakan super constructor dengan position "Intern"
    public Intern(String name, int salary, int duration, String university) {
        super(name, salary, "Intern");
        this.duration = duration;
        this.university = university;
    }

    // TODO: Override method displayInfo()
    // Panggil displayInfo() pada kelas Employee terlebih dahulu, lalu tampilkan:
    // "Durasi Magang : <duration> bulan"
    // "Universitas : <university>"
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Durasi Magang : " + duration + " bulan");
        System.out.println("Universitas : " + university);
    }

    // TODO: Override method resign()
    // Tampilkan: "<name> (<position>) telah menyelesaikan masa magangnya"
    // Lalu panggil resign() pada kelas Employee
    public void resign() {
        System.out.println(name + " (" + position + ") telah menyelesaikan masa magangnya");
        super.resign();
    }

    // TODO: Override method work()
    // Panggil work() pada kelas Employee terlebih dahulu, lalu tambahkan salary dengan hasil calculateBonus()
    public void work() {
        super.work();
        salary += calculateBonus();
    }

    // TODO: Override method calculateBonus()
    // Return 0 (intern tidak mendapat bonus)
    public int calculateBonus() {
        return 0;
    }

    // TODO: Buat method submitReport() yang menampilkan:
    // "<name> menyerahkan laporan magang kepada mentor"
    public void submitReport() {
        System.out.println(name + " menyerahkan laporan magang kepada mentor");
    }

    // TODO: Buat getter dan setter untuk duration dan university
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
