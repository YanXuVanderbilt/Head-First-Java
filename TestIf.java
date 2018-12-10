import java.io.*;
import java.util.*;

public class TestIf
{
  public static void main(String[] args)
  {
    int n = java.io.DataInput.readInt();//read user input
    if (n > 0)
      if (n % 2 == 0)
      System.out.println(n);
    else 
      System.out.println(n + " is not positive");
  }
}