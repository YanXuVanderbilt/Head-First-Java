public class P042501 
{
  public static void main(String[] args) 
  {
    int someNum = 5;
    for (int i = 0; i < someNum; i ++)
    {
      i++;
      someNum--;
    }
    //System.out.println(i);
    System.out.println(someNum);
  }
}
