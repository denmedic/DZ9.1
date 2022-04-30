package lesson1;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int bookYear;

    public Book(String bookName,Author bookAuthor, int bookYear){
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
    public Author getBookAuthor(){
        return bookAuthor;
    }

    public void setBookYear(int bookYear){
        this.bookYear = bookYear;
    }

}
