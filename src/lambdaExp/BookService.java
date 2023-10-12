package lambdaExp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//this is traditional way
public class BookService {

     List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new MyComparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}
class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
