package cursitschool19;

public class Book extends java.awt.print.Book {
    private String title;
    private Author author;
    private String publisher;
    private String ISBN;
    private int numCopies;
    public Book(String title, Author author, String publisher, String ISBN, int numCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.numCopies = numCopies;
    }
    public void addCopy() {
        numCopies++;
    }
    public void removeCopy() {
        if (numCopies > 0) numCopies--;
    }
    public boolean isAvailable() {
        return numCopies > 0;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author.getName() + ", Publisher: " + publisher +
                ", ISBN: " + ISBN + ", Copies: " + numCopies);
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
}