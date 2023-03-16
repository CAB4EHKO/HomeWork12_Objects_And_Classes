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


}

