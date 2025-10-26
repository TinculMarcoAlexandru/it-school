package cursitschool17;

class Bankabc implements Bank {
    private double balance = 100;
    @Override
    public double getBalance() {
        return balance;
    }
}