public class TestForEach
{
  static int[] a = {1,3,5,7,9,11};
  public static void main(String[] args)
  {
    TestForEach test = new TestForEach();
    for (int b : a)
    {
      System.out.println(b);
    }
  }
}