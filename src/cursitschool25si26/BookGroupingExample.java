package cursitschool25si26;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookGroupingExample {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Hobbit", "J.R.R. Tolkien", 1937),
                new Book("The Fellowship of the Ring", "J.R.R. Tolkien",
                        1954),
                new Book("The Two Towers", "J.R.R. Tolkien",
                        1954),
                new Book("The Return of the King", "J.R.R. Tolkien",
                        1955),
                new Book("Harry Potter and the Philosopher's Stone",
                        "J.K. Rowling",
                        1997),
                new Book("Harry Potter and the Chamber of Secrets",
                        "J.K. Rowling",
                        1998),
                new Book("The Da Vinci Code", "Dan Brown", 2003)
        );
        Map<String, List<String>> booksByAuthorBefore2000 = books.stream()
                .filter(b -> b.getYear() < 2000)
                .collect(Collectors.groupingBy(
                        Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())
                ));
        booksByAuthorBefore2000.forEach((author, titles) ->
                System.out.println(author + " -> " + titles)
        );
    }
}