public class Book {

    private String name;
    private String author;
    Category category;


    public Book(String name, String author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Category getCategory() {
        return category;
    }
}
