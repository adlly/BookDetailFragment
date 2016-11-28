package lly.bookdetailfragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by addy on 2016/11/28.
 */

public class BookContent {
    public static class Book{
        public Integer id;
        public String title;
        public String desc;
        @Override
        public String toString() {
            return title;
        }

        public Book(Integer id, String title, String desc) {
            this.id = id;
            this.title = title;
            this.desc = desc;
        }
    }
    public static List<Book> ITEMS = new ArrayList<>();
    public static Map<Integer, Book> ITEM_MAP = new HashMap<Integer,Book>();
    static{
        addItem(new Book(1, "a", "ccc"));
        addItem(new Book(2, "b", "ddd"));
        addItem(new Book(3, "e", "fff"));
    }
    private static void addItem(Book book){
        ITEMS.add(book);
        ITEM_MAP.put(book.id, book);
    }
}
