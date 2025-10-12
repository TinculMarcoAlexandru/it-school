package cursitschool17;

public interface Bank {
    double getBalance();
}


class Bankabc implements Bank {
    private double balance = 100;

    @Override
    public double getBalance() {
        return balance;
    }
}

class Bankdef implements Bank {
    private double balance = 150;

    @Override
    public double getBalance() {
        return balance;
    }
}

class Bankghi implements Bank {
    private double balance = 200;

    @Override
    public double getBalance() {
        return balance;
    }
}


