import java.util.Scanner;
public class BankTest
{
  public BankTest()
  {}
  
  public static void main(String args[])
  {
    BankAccount a = new BankAccount("KevinC", 800.00);
    BankAccount b = new BankAccount("TimB", 500.00);
    
    System.out.println(b.getBalance());
    Scanner a = new Scanner(System.in);
    System.out.println("input the money you want to deposit");
    int mon = s.nextInt();
    b.deposit("TimB", mon);
    System.out.println(b.getBalance());
    
    Scanner t = new Scanner(System.in);
    System.out.println("Want to withdraw?Input password:");
    String inpass t.nextLine();
    System.out.println(inpass);
    
    System.out.println("input the money you want to withdraw");
    mon = s.nextInt();
    b.withdraw(inpass, mon);
    System.out.println(b.getBalance());
  }
}