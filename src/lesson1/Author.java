package lesson1;

import java.util.Objects;

public class Author {
    private String bookFirstNameAuthor;
    private String bookLastNameAuthor;

    public Author(String bookFirstNameAuthor,String bookLastNameAuthor){
        this.bookFirstNameAuthor = bookFirstNameAuthor;
        this.bookLastNameAuthor = bookLastNameAuthor;}

    public String getBookFirstNameAuthor(){
        return bookFirstNameAuthor;
    }
    public String getBookLastNameAuthor(){
        return bookLastNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return bookFirstNameAuthor.equals(author.bookFirstNameAuthor) && bookLastNameAuthor.equals(author.bookLastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookFirstNameAuthor, bookLastNameAuthor);
    }

    @Override
    public String toString() {
        return "Author{" +
                "bookFirstNameAuthor='" + bookFirstNameAuthor + '\'' +
                ", bookLastNameAuthor='" + bookLastNameAuthor + '\'' +
                '}';
    }
}
