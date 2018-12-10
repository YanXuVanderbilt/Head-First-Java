import java.util.Scanner;

public class ScannerTest 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
      
    //receive integer
    int i = s.nextInt();
    System.out.println(i);
  }
}
