
// TODO: 
// Lengkapi definisi kelas ChampionDuel 
// dengan menambahkan sebuah parameter 
// generik yang harus menerapkan interface Comparable.
final class ChampionDuel<...> {
    // TODO:
    // 1. Buat atribut final dengan tipe generik dari elemen pertama dan elemen
    // kedua
    // 2. Buat atribut final label dengan tipe String untuk menyimpan label dari
    // duel saat ini

    ChampionDuel(String label, ... first, ... second) {
        // TODO: Lengkapi definisi konstruktor.
    }

    ... decideChampion() {
        // TODO:
        // 1. Lengkapi definisi fungsi dengan menambahkan return type yang sesuai dengan tipe generik dari elemen pertama dan kedua
        // 2. Kembalikan hasil dari fungsi findChampion dari Champion Finder
    }

    String report() {
        // TODO:
        // Kembalikan string <tanpa newline dimanapun>:
        // "<label> champion between <player pertama> and <player kedua> is: <hasil
        // decide champion>"
    }
}
