package lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BookDAO {

    List<Book> getBooks(){
       List<Book> books = new ArrayList<>();
       books.add(new Book(101, "core java", 400));
       books.add(new Book(102, "hibernate", 300));
       books.add(new Book(103, "spring", 500));
       books.add(new Book(104, "python", 800));
       books.add(new Book(105, "mysql", 400));
       return books;

    }
}
