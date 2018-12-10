public class P042305 
{
  String s;
  String t;
  
  public void mystery (String a, String b)
  {
    a = a + b;
    b = b + a;
    System.out.print(a + " " + b);
  }

  public static void main(String[] args) {
    P042305 p042305 = new P042305();
    p042305.mystery("Elizabeth", "Andrew");
  }
}
  