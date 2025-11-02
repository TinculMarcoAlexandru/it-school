package cursitschool19;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String address;
    private String contactInfo;
    private List<Book> borrowedBooks;
    public Member(String name, String address, String contactInfo) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
}
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.removeCopy();
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available.");
        }
    }
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.addCopy();
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }
    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
    public void displayMemberInfo() {
        System.out.println("Member: " + name + ", Address: " + address + ", Contact: " + contactInfo);
    }
    public String getName() {
        return name;
    }
}