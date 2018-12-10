import java.util.*;

public class TestTree {
  public static void main (String[] args) {
    new TestTree().go();
    }
    
  public void go() {
    Book b1 = new Book("How Cat's Work");
    Book b2 = new Book("Remix Your Body");
    Book b3 = new Book("Finding Emo");
    
    TreeSet<Book> tree = new TreeSet<Book>();
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);
    System.out.println(tree);
  }
}

class Book implements Comparable {
  String title;
  public Book(String t) {
    title = t;
  }
  public int compareTo(Object b) {
    Book book = (Book) b;
    return (title.compareTo(book.title));
  }
}