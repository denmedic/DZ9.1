package lesson1;

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

}
