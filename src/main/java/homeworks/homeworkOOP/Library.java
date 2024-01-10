package homeworks.homeworkOOP;

public class Library {
    public static void main(String[] args) {

        Author author = new Author("Marius Chivu", "marius.chivu@yahoo.com");
        Book book = new Book("Trei Saptamani in Anzi", 2020, author, 54.99);

        System.out.println("Book " + book.getBookName() + " (" + (book.getPrice() + " RON), ") + "by " + book.getAuthor().getName() + " published in " + book.getYear() + ".");
        System.out.println("Emailul lui " + book.getAuthor().getName() +  ", autorul cartii, " + book.getBookName() + " este: " + author.getEmail() + ".");

    }
}
