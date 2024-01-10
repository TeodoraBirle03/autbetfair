package homeworks.homeworkOOP;

public class Book {
    //    declararea variabilelor clasei Book;
    private String bookName;
    private int year;
    //    variabila de tip Author;
    private Author author;
    private Double price;

    public Book(String bookName, int year, Author author, double price) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

}
