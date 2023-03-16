public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой.");
        Author author2 = new Author("Фёдор", "Достоевский.");
        Author author3 = new Author("Лев", "Толстой.");
        Book book1 = new Book("\"Война и мир\"", author1, 1865);
        Book book2 = new Book("\"Преступление и наказание\"", author2, 1866);
        Book book3 = new Book("\"Война и мир\"", author1, 1865);

        book1.setYearPublished(1869);
        System.out.println(book1.toString());
        System.out.println(author1.toString());
        System.out.println(author1.equals(author3));
        System.out.println(book1.equals(book3));
        System.out.println(author1.hashCode() + "\n" + author3.hashCode());
        System.out.println(book1.hashCode() + "\n" + book3.hashCode());

    }
}