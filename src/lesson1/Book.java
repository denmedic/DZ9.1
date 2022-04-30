package lesson1;

public class Book {
    private String bookName;
    private int bookYear;

    public Book(String bookName, int bookYear){
        this.bookName = bookName;
        this.bookYear = bookYear;
    }
    public String getBookName(){
        return bookName;
    }
    public int getBookYear(){
        return bookYear;
    }
    public void setBookYear(int bookYear){
        this.bookYear = bookYear;
    }

}
