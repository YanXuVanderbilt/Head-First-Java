public class TestMergeSort {
  //precondition: x is an array in integers; x.length >= 0
  //postcondition: x is sorted from least to greatest
  public static void mergeSort (int[] x)
  {
    int[] temp = new int[x.length];
    mergeSortHelper(x, 0, x.length - 1,temp);
  }
  public static void mergeSortHelper (int[] x,int lowIndex, int highIndex, int[] temp)
  {
    if (lowIndex < highIndex)
    {
      int mid = (lowIndex + highIndex) / 2;
      mergeSortHelper(x, lowIndex, mid, temp);
      mergeSortHelper(x,mid+1,highIndex,temp);
      merge(x, lowIndex, mid, highIndex, temp);
    }
  }
  
  public static void merge(int[] x, int lowIndex, int mid, int highIndex, int[] temp) 
  {
    int l = lowIndex;
    int m = mid + 1;
    int n = highIndex;
    while (l <= mid && m <= highIndex)
    {
      if (x[l] < x[m])
      {
        temp[n] = x[l];
        l++;
      }
      else
      {
        temp[n] = x[m];
        m++;
      }
    n++;
    }
    while (l <= mid)
    {
      temp[n] = x[l];
      l++;
      n++;
    }
    while (m <= highIndex)
    {
      temp[n] = x[m];
      m++;
      n++;
    }
    for (n = lowIndex; n <= highIndex; n++)
    {
      x[n] = temp[n];
    }
  }   
  
  static int[] b = {1,3,4,13,44,33,56,100,77,2};
  
  public static void main(String[] args)
  {
    TestMergeSort test = new TestMergeSort();
    for (int i = 0; i < b.length; i++)
    {
      System.out.print(b[i] + " ");
    }
    System.out.println("");
    test.mergeSort(b);
    for (int i = 0; i < b.length; i++)
    {
      System.out.print(b[i] + " ");
    }
    System.out.println("");
  }
}
    