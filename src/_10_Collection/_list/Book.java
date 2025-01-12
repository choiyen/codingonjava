package _10_Collection._list;

public class Book
{
    private  String title;
    private String auther;

    public Book(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book {" + "title  = '" + title + "', author = '" + auther + "' }\n";
    }
}
