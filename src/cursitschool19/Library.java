package cursitschool19;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayAllBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
    public void searchBook(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) ||
                    book.getAuthor().getName().equalsIgnoreCase(query) ||
                    book.getISBN().equalsIgnoreCase(query)) {
                book.displayBookInfo();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void addMember(Member member) {
        members.add(member);
    }
    public void removeMember(Member member) {
        members.remove(member);
    }
    public void displayAllMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            member.displayMemberInfo();
        }
    }
    public void searchMember(String query) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(query)) {
                member.displayMemberInfo();
                return;
            }
        }
        System.out.println("Member not found.");
    }
    public void addBook(java.awt.print.Book book1) {
    }
}