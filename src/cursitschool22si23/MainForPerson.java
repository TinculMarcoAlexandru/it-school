package cursitschool22si23;

public class MainForPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Marco", 30, "Marco@gmail.com");
        Person p2 = new Person("Marco", 30, "Marco@gooner.com");

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode()));
    }
}