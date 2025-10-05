package cursitschool11;

import java.util.ArrayList;

public class ChristmasWishList {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("Laptop");
        wishlist.add("Headphones");
        wishlist.add("Smartwatch");
        wishlist.add("Book");
        wishlist.add("Camera");

        System.out.println("Christmas Wishlist:");
        for (String item : wishlist) {
            System.out.println(item);
        }
    }
}


