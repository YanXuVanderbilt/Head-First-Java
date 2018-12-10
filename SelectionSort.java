public class SelectionSort 
{
  public static void selectionSort1(int[] numbers)
  {
    for (int i = 0; i < numbers.length - 1; i++ )
    {
      int position = i;
      for (int k = i + 1; k < numbers.length; k++)
      {
        if (numbers[k] < numbers[position])
        {
          position = k;
        }
      }
      int temp = numbers[i];
      numbers[i] = numbers[position];
      numbers[position] = temp;
    }
  }
  
  static int[] numbers = {7,12,44,23,4,77,103,88,14};
  
  public static void main(String[] args) 
  {
    SelectionSort sort = new SelectionSort();
    for (int i = 0; i < numbers.length; i++)
    {
      System.out.print(sort.numbers[i] + " ");
    }
    System.out.println("");
    sort.selectionSort1(numbers);
    for (int i = 0; i < numbers.length; i++)
    {
      System.out.print(sort.numbers[i] + " ");
    }
    System.out.println("");
  }
}
  
  
      