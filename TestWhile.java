public class TestWhile
{
  public static void main(String[] args)
  {
    TestWhile test = new TestWhile();
    int i = 1, mult3 = 3;
    while (mult3 < 20)
    {
      System.out.println(mult3 + " ");
      i++;
      mult3 *= i;
    }
  }
}
// outputs 3 6 18