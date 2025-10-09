/**
 * FireEvoNimons.java
 * Bentuk evolusi dari Pokenimons tipe api.
 *
 * TODO:
 * - Lengkapi deklarasi kelas ini agar menjadi turunan dari bentuk api sebelumnya.
 */
public class FireEvoNimons extends FireNimons {
    /**
     * Menciptakan bentuk evolusi tipe api.
     *
     * @param name nama Pokenimons
     * @param hp   HP awal
     *
     * TODO: Panggil konstruktor induk yang sesuai.
     */
    public FireEvoNimons(String name, int hp) { 
        super(name, hp);
    }

    /**
     * Nama skill khusus bentuk evolusi api.
     *
     * @return nama skill
     *
     * TODO: Kembalikan nama skill untuk bentuk evolusi api, yaitu "Flame Storm".
     */
    @Override
    protected String skillName() {
        return "Flame Storm";
    }

    /**
     * Base damage untuk skill bentuk evolusi api.
     *
     * @return nilai damage dasar
     *
     * TODO: Kembalikan base damage skill bentuk evolusi api, yaitu 25.
     */
    @Override
    protected int skillBaseDamage() {
        return 25;
    }
}