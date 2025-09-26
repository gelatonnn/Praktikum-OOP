public class Staff extends Employee {
    // TODO: Buat atribut private String department
    private String department;

    // TODO: Buat constructor yang menerima name, salary, department
    // Gunakan super constructor dengan position "Staff"
    public Staff(String name, int salary, String department) {
        super(name, salary, "Staff");
        this.department = department;
    }

    // TODO: Override method displayInfo()
    // Panggil displayInfo() pada kelas Employee terlebih dahulu, lalu tampilkan:
    // "Departemen : <department>"
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Departemen : " + department);
    }

    // TODO: Override method resign()
    // Tampilkan pesan dengan format: "<name> (<position>) berhenti dari departemen <department>"
    // Lalu panggil resign() pada kelas Employee terlebih dahulu
    public void resign() {
        System.out.println(name + " (" + position + ") berhenti dari departemen " + department);
        super.resign();
    }

    // TODO: Override method work()
    // Panggil work() pada kelas Employee terlebih dahulu, lalu tambahkan salary dengan hasil calculateBonus()
    public void work() {
        super.work();
        salary += calculateBonus();
    }

    // TODO: Override method calculateBonus()
    // Return 10% dari salary (gunakan casting int untuk hasil)
    public int calculateBonus() {
        return (int)(salary * 0.1);
    }

    // TODO: Buat method requestLeave(int days) yang menampilkan:
    // "<name> mengajukan cuti selama <days> hari"
    public void requestLeave(int days) {
        System.out.println(name + " mengajukan cuti selama " + days + " hari");
    }

    // TODO: Buat getter dan setter untuk department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
