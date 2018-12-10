public class P042306 {
  public static void main(String[] args) 
  {
    P042306 p042306 = new P042306();
    String[] x;
    x = new String[10];
    p042306.initialize(x);
    
    int i;
    int j;
    for (i = 0; i < 5; i++)
    {
      for (j = 0; j < 10; j++)
      {
        System.out.print (x[j].substring(i, i + 1));
      }
      System.out.println("");
    }
  }
  
  public String[] initialize(String[] s) 
  {
    s[0] = "abcde";
    s[1] = "bcdef";
    s[2] = "cdefg";
    s[3] = "defgh";
    s[4] = "efghi";
    s[5] = "fghij";
    s[6] = "ghijk";
    s[7] = "hijkl";
    s[8] = "ijklm";
    s[9] = "jklmn";
    return s;
    
  }
}
  
  