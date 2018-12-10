public class TestEnhancedLoop 
{
  int[] nums = {11,99,77,0,15};
  
  public void search(int target) 
  {
    for (int i:nums)
      if (nums[i] == target)
        System.out.println("Found at " + i);
  }
  
  public static void main(String[] args) 
  {
    TestEnhancedLoop test = new TestEnhancedLoop();
    test.search(15);
  }
}
    