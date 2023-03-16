public class Book {
    private String title;
    private Author author;
    private int yearPublished;

    public Book(String title, Author author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public void setYearPublished(int year) {
        this.yearPublished = year;
    }
    @Override
    public String toString() {
        return title + " автор: " + author + "\nИздание " + yearPublished + " г.";
    }
     @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b = (Book) other;
        return title.equals(b.title) && author.equals(b.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author);
    }
}

