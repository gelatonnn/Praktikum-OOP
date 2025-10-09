/**
 * FireNimons.java
 * Representasi Pokenimons bertipe FIRE.
 *
 * TODO:
 * - Lengkapi deklarasi kelas ini agar mewarisi kelas induk abstrak yang digunakan
 * - Kelas ini menyerang jarak dekat
 */
public class FireNimons extends Pokenimons {
  /**
   * Membuat instance FireNimons baru.
   *
   * @param name nama Pokenimons
   * @param hp   HP awal
   *
   * TODO:  Buatlah konstruktor ini dengan menggunakan super untuk menginisialisasi tipe FIRE.
   */
  public FireNimons(String name, int hp) {
    super(name, hp, Type.FIRE);
  }

  /**
   * Mengembalikan nama skill unik milik FireNimons.
   *
   * @return nama skill
   *
   * TODO: Kembalikan nama skill FireNimons, yaitu "Flamethrower".
   */
  @Override
  protected String skillName() {
    return "Flamethrower";
  }

  /**
   * Mengembalikan base damage untuk skill FireNimons.
   *
   * @return nilai damage dasar
   *
   * TODO: Kembalikan nilai base damage untuk skill FireNimons, yaitu 12.
   */
  @Override
  protected int skillBaseDamage() {
    return 12;
  }

  /**
   * Evolusi FireNimons.
   *
   * Aturan yang diharapkan:
   * - Jika fainted (HP 0), tidak dapat berevolusi; cetak pesan "<nama_pokenimons> has fainted and cannot evolve.".
   * - Jika sudah berada pada bentuk akhir, kembalikan bentuk saat ini dan cetak pesan "<nama_pokenimons> is already in final form.".
   * - Jika level telah mencapai minimal level 10, cetak pesan "<nama_pokenimons> evolves into FireEvoNimons!"
   * lalu kembalikan bentuk evolusi dengan HP bertambah 10 dan level dipertahankan.
   * - Jika belum memenuhi syarat, cetak pesan "<nama_pokenimons> is not ready to evolve.".
   * * For your exploration: manfaatkan instanceof untuk melakukan guard.
   *
   * @return objek bentuk saat ini atau bentuk evolusi
   *
   * TODO: Implementasikan seluruh logika di atas sesuai spesifikasi.
   */
  @Override
  public Pokenimons evolve() {
    if (this.isFainted()) {
      System.out.println(this.getName() + " has fainted and cannot evolve.");
      return this;
    }
    if (this instanceof FireEvoNimons) {
      System.out.println(this.getName() + " is already in final form.");
      return this;
    }
    if (this.getLevel() >= 10) {
      System.out.println(this.getName() + " evolves into FireEvoNimons!");
      FireEvoNimons evolvedForm = new FireEvoNimons(this.getName(), this.getHp() + 10);
      evolvedForm.setLevel(this.getLevel());
      return evolvedForm;
    } else {
      System.out.println(this.getName() + " is not ready to evolve.");
      return this;
    }
  }
}