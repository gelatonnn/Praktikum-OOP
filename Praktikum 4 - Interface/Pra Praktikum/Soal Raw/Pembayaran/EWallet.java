public class EWallet extends Pembayaran implements Payable, Refundable {

    public EWallet(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("[EWallet] Paid: " + amount + ". Remaining balance: " + getBalance());
        } else {
            System.out.println("[EWallet] Payment failed. Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void refund(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("[EWallet] Refunded: " + amount + ". New balance: " + getBalance());
        } else {
            System.out.println("[EWallet] Refund failed. Invalid amount.");
        }
    }
}
