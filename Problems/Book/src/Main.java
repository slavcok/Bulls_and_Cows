import java.util.*;
class Book {

    String title;
    String yearOfPublishing;
    String[] authors;

    public Book (String title, String yearOfPublishing, String[] authors)  {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;

        this.authors = Arrays.copyOf(authors, authors.length);

    }
}
