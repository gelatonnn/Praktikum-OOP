class Game {
    // TODO: Deklarasi atribut: namaGame (String), genre (String), developer
    // (Developer)
    String namaGame;
    String genre;
    Developer developer;


    // TODO: Deklarasi atribut: playerCount (int) awal 0
    int playerCount = 0;

    // TODO: Deklarasi atribut statik: totalGame (int)
    static int totalGame = 0;

    // TODO: Constructor set semua field dan increment totalGame
    Game(String namaGame, String genre, Developer developer) {
        // HINT: this.namaGame = ...; dst.
        this.namaGame = namaGame;
        this.genre = genre;
        this.developer = developer;
        this.playerCount = 0;
        totalGame++;
    }

    // TODO: Saat player join, increment playerCount dan cetak:
    // "<username> bergabung ke game <namaGame>."
    void joinGame(Player p) {
        // HINT: Akses p.username
        playerCount++;
        System.out.println(p.username + " bergabung ke game " + namaGame + ".");
    }

    // TODO: Kembalikan totalGame
    static int getTotalGame() {
        return totalGame; // ganti dengan nilai dari totalGame
    }
}