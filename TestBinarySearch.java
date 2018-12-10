public class TestBinarySearch {
  static int[] b = {1,3,5,7,9,11,13,15,16,90};

  public int findTarget(int[] a , int target)
  {
    int f = 0, h = a.length, g = 0;
    
    for (int i = 0; i < h; i ++)
    {
      g = (f + h)/2;
      if (a[g] < target)
        f = g + 1;
      else if (a[g] > target)
        h = g - 1;
    }
    if (a[g] == target)
      return g;
    return -1;
  }
  
  public static void main(String[] args)
  {
    TestBinarySearch test = new TestBinarySearch();
    System.out.println(test.findTarget(b, 11));
    System.out.println(test.findTarget(b,12));
  }
}