package lesson07;

public class Book {
    private String ISBN;
    private String authorName;
    private String title;

    public Book(String ISBN, String authorName, String title) {
        this.ISBN = ISBN;
        this.authorName = authorName;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
