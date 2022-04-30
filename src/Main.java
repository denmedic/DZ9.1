import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args){
        Book bookFirst = new Book("1984","George Orwell", 1948);
        Author authorFirst = new Author("George","Orwell");
        Book bookSecond = new Book("Dunno on the Moon","Nikolay Nosov", 1965);
        Author authorSecond = new Author("Nikolay","Nosov");
        System.out.println("Название книги- " + bookFirst.getBookName() + " " + "Год выпуска- " + bookFirst.getBookYear() + " " + "Имя автора- " + authorFirst.getBookFirstNameAuthor() + " " + "Фамилия автора- " + authorFirst.getBookLastNameAuthor());
        System.out.println("Название книги- " + bookSecond.getBookName() + " " + "Год выпуска- " + bookSecond.getBookYear() + " " + "Имя автора- " + authorSecond.getBookFirstNameAuthor() + " " + "Фамилия автора- " + authorSecond.getBookLastNameAuthor());
        bookFirst.setBookYear(2022);
        System.out.println("Название книги- " + bookFirst.getBookName() + " " + "Год выпуска- " + bookFirst.getBookYear() + " " + "Имя автора- " + authorFirst.getBookFirstNameAuthor() + " " + "Фамилия автора- " + authorFirst.getBookLastNameAuthor());
    }
}