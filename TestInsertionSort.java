public class TestInsertionSort {
  //precondition: x is an array of integers; x.length >= 0
  //postcondition: x is sorted from least to grestest
  public static void insertionSort(int[] x)
  {
    for (int i = 1; i < x.length; i++)
    {
      int temp = x[i];
      int j = i - 1;
      while (j >= 0 && x[j] > temp)
      {
        x[j + 1] = x[j];
        j--;
      }
      x[j + 1] = temp;
    }
  }
  
  static int[] b = {1,13,0,7,9,12,24,90,50};
  
  public static void main(String[] args)
  {
    TestInsertionSort test = new TestInsertionSort();
    for (int i = 0; i < b.length; i++)
    {
      System.out.print(b[i] + " ");
    }
    System.out.println("");
    test.insertionSort(b);
    for (int i = 0 ;i < b.length; i++)
    {
      System.out.print(b[i] + " ");
    }
    System.out.println("");
  }
}