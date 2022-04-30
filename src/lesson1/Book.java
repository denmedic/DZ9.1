package lesson1;

public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookYear;

    public Book(String bookName,String bookAuthor, int bookYear){
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.bookAuthor = bookAuthor;
    }
    public String getBookName(){
        return bookName;
    }
    public int getBookYear(){
        return bookYear;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }

    public void setBookYear(int bookYear){
        this.bookYear = bookYear;
    }

}
