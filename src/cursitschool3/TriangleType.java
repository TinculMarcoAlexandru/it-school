package cursitschool3;

public class TriangleType {
    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 5;
        int sideThree = 8;

        // Using ternary operator to determine triangle type
        String type = (sideOne == sideTwo && sideTwo == sideThree) ?
                "Equilateral" :
                (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree)
                ? "Isosceles" : "Scalene";

        System.out.println("The triangle is: " + type);
    }

}

