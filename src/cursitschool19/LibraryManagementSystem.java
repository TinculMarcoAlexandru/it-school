package cursitschool19;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "British", "31-07-1965");
        Book book1 = new Book("Harry Potter", author1, "Bloomsbury", "123456",
                5);
        author1.addBook(book1);
        Member member1 = new Member("Ronald", "123 Main St", "Ronald@LongBottom.com");
        Library library = new Library();
        library.addBook(book1);
        library.addMember(member1);
        library.displayAllBooks();
        library.displayAllMembers();
        member1.borrowBook((Book) book1);
        member1.displayBorrowedBooks();
        library.searchBook("Harry Potter");
    }
}