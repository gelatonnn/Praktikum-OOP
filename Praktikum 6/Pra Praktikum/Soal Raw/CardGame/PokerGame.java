public class PokerGame extends CardGame {
    private int blindAmount;

    public PokerGame(int maxPlayers, int blindAmount) {
        super("Poker", maxPlayers);
        this.blindAmount = blindAmount;
    }

    // TODO: Buat nested enum bernama HandRank
    // Enum ini merepresentasikan ranking hand dalam poker
    // Urutan nilai (dari terendah ke tertinggi):
    // HIGH_CARD, PAIR, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT, FLUSH,
    // FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH
    //
    // Pertanyaan: Mengapa HandRank cocok dibuat sebagai nested enum?
    // Hint: Apakah ranking hand ini spesifik untuk PokerGame saja?

    // TODO: Override method startGame() dari parent class
    // Tampilkan: "Game Poker dimulai! Blind amount: [blindAmount]"
    // Hint: Ingat konsep polymorphism dan method overriding

    // TODO: Buat method evaluateHand(Player player)
    // Method ini akan mengevaluasi kartu yang dimiliki player
    // Tampilkan: "Mengevaluasi hand pemain [nama player] untuk Poker"
    // Hint: Gunakan getter dari Player untuk mendapatkan nama

    // TODO: Buat method getHandRank(Player player) yang return HandRank
    // Method ini mengembalikan ranking hand berdasarkan kartu player
    // Untuk simplifikasi, cukup return HIGH_CARD
    // Note: Dalam implementasi nyata, method ini akan menganalisis
    // kombinasi kartu untuk menentukan ranking yang sebenarnya
}