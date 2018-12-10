import java.util.*;

public class P042303 {
  private void P042303() {
    List<Integer> list = new ArrayList<Integer>();
    list.add(new Integer(7));
    list.add(new Integer(6));
    list.add(new Integer(5));
    list.add(new Integer(4));
    list.add(new Integer(3));
    list.add(new Integer(2));
    list.set(0, new Integer(1));
    System.out.println(list);
  }
  
  public static void main(String[] args) {
    P042303 p042303 = new P042303();
    p042303.P042303();
  }
}