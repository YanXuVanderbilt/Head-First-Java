public class P042302 {
  public void P042302() {
    int k;
    int A[];
    A = new int [7];
    for (k = 0; k < A.length; k++)
    {
      A[k] = A.length - k;
    }
    for (k = 0; k < A.length - 1; k++)
    {
      A[k+1] = A[k];
    }
    for (int i = 0; i < 7; i++)
    System.out.print(A[i]);
  }
  
  public static void main(String[] args) {
    P042302 p042302 = new P042302();
    p042302.P042302();
  }
}