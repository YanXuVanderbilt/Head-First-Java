public class MulTable 
{
  public static void main(String[] args)
  {
    int i,j;  //int type
    for (i = 1; i <= 9; i++)  // for loop
    {
      for (j = 1; j<=i; j++)
      {
        System.out.print(i + "*" + j + "=" + (i*j) + "\t");  //output
      }
      System.out.print("\n");  //output
    }
  }
}