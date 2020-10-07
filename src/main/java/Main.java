import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        List<Book> bookList1 = new ArrayList<>();
        List<Book> bookList2 = new ArrayList<>();
        List<Book> bookList3 = new ArrayList<>();

        Book book1 = new Book("book1", "William Shakespeare", Category.CLASSICS);
        Book book2 = new Book("book2", "Leo Tolstoy", Category.DRAMA);
        Book book3 = new Book("book3", "Homer", Category.DRAMA);
        Book book4 = new Book("book4", "Homer", Category.ROMANCE);
        Book book5 = new Book("book5", "Homer", Category.DRAMA);
        Book book6 = new Book("book6", "Leo Tolstoy", Category.ROMANCE);
        Book book7 = new Book("book7", "Fyodor Dostoevsky", Category.CLASSICS);
        bookList1.add(book1);
        bookList1.add(book2);
        bookList2.add(book3);
        bookList2.add(book4);
        bookList2.add(book5);
        bookList3.add(book6);
        bookList3.add(book7);

        Room room1 = new Room("room1", "red");
        Room room2 = new Room("room2", "blue");
        Room room3 = new Room("room3", "yellow");
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        room1.setBooks(bookList1);
        room2.setBooks(bookList2);
        room3.setBooks(bookList3);


        Library library = new Library();
        library.setRooms(rooms);


        System.out.println("Most popular Author in room1: " + room1.getMostPopularAuthor(bookList1));
        System.out.println("Total number of books in room3: " + room3.getNoOfBooksByCategory(Category.CLASSICS));
        System.out.println("All books written by Leo Tolstoy: ");
        library.getBooksByAuthor("Leo Tolstoy").forEach(book -> System.out.println(book.getName()));
        System.out.println("All rooms painted in red: ");
        library.getRoomsByColor("red").forEach(room -> System.out.println(room.getName()));
    }
}
