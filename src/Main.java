public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой.");
        Author author2 = new Author("Фёдор", "Достоевский.");
        Book book1 = new Book("\"Война и мир\"", author1, 1865);
        Book book2 = new Book("\"Преступление и наказание\"", author2, 1866);

        book1.setYearPublished(1869);

    }
}