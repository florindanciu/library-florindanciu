import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Room> rooms;

    public List<Room> getRoomsByColor(String color) {
        List<Room> rooms = new ArrayList<>();
        for (Room room : this.rooms) {
            if (room.getColor().equals(color)) {
                rooms.add(room);
            }
        }
        return rooms;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        rooms.forEach(room -> {
            room.getBooks().forEach(book -> {
                if (book.getAuthor().equals(author)){
                    books.add(book);
                }
            });
        });
        return books;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
