import java.util.*;

class BookCompare implements Comparator<Book> {
  public int compare(Book one, Book two) {
    return (one.title.compareTo(two.title));
  }
}

class Test {
  public static void main(String[] args) {
    new Test().go();
  }
    
  public void go() {
  Book b1 = new Book("How Cats Work");
  Book b2 = new Book("Remix Your Body");
  Book b3 = new Book("Finding Emo");
  BookCompare bCompare = new BookCompare();
  TreeSet<Book> tree = new TreeSet<Book>(bCompare);
  tree.add(new Book("How Cats Work"));
  tree.add(new Book("Finding Emo"));
  tree.add(new Book("Remix your Body"));
  System.out.println(tree);
  }
}

class Book {
  String title;
  public Book(String t) {
    title = t;
  }
}