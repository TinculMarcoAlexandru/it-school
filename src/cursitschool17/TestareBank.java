package cursitschool17;

public class TestareBank {
    public static void main(String[] args) {
        Bank bankabc = new Bankabc();
        Bank bankdef = new Bankdef();
        Bank bankghi = new Bankghi();
        System.out.println("Balance in Bank 1: $" + bankabc.getBalance());
        System.out.println("Balance in Bank 2: $" + bankdef.getBalance());
        System.out.println("Balance in Bank 3: $" + bankghi.getBalance());}
}