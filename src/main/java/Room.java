
import java.util.*;

public class Room {

    private String name;
    private String color;
    private List<Book> books;


    public Room(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getNoOfBooksByCategory(Category category) {
        int count = 0;
        for (Book book : this.books){
            if (book.getCategory().equals(category)){
                count++;
            }
        }
        return count;
    }

    public String getMostPopularAuthor(List<Book> books) {
        HashMap<String, Integer> authors = new HashMap<>();
        for (Book book : books) {
            authors.merge(book.getAuthor(), 1, Integer::sum);
        }

        int maxValue = Collections.max(authors.values());
        for (String key : authors.keySet()) {
            if (authors.get(key) == maxValue) {
                return key;
            }
        }
        return "No popular Author";
    }

    public String getColor() {
        return color;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
