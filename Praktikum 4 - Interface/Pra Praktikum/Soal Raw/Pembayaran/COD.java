public class COD extends Pembayaran implements Payable {

    public COD(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("[COD] Paid: " + amount + ". Remaining balance: " + getBalance());
        } else {
            System.out.println("[COD] Payment failed. Insufficient balance or invalid amount.");
        }
    }
}
