public class TestTrial {

  public void trial() 
  {
    int a = 10;
    int b = 5;
    doubleValues(a,b);
    System.out.print(b);
    System.out.print(a);
  }

  public void doubleValues(int c, int d) 
  {
    c = c * 2;
    d = d * 2;
    System.out.print(c);
    System.out.print(d);
  }

  public static void main(String[] args) {
    TestTrial testTrial = new TestTrial();
    testTrial.trial();
  }
}
