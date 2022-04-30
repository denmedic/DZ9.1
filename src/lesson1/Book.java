package lesson1;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookName.equals(book.bookName) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, bookYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor=" + bookAuthor +
                ", bookYear=" + bookYear +
                '}';
    }



}
