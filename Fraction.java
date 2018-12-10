public class Fraction
{
  private int numerator;
  private int denominator;
  
  public Fraction()
  {
    numerator = 0;
    denominator = 1;
  }
  
  public Fraction(int n, int d)
  {
    numerator = n;
    denominator = d;
  }
  
  //postcondition: returns the numerator
  public int getNumerator()
  { 
    return numerator;
  }
  
  //postcondition returns the denominator
  public int getDenominator()
  { 					
    return denominator;
  }
  
  //postcondition returns the greatest common divisor of x and y
  public int gcd(int x, int y)
  { 
    int a = Math.min(x,y);
    int b = 1;
    for (int i = 1; i < a; i++) 
    {
      if (((x % i) == 0) && ((y % i) == 0))
      {
        b = i;
      }
    }
    return b;
  }
  
  //postcondition: returns the Fraction that is the result of multiplying this Fraction and f
  
  public Fraction multiply (Fraction f)
  { 
    return new Fraction(numerator * f.getNumerator(), denominator * f.getDenominator());
  }
  // ... other methods not shown
  
  public void printFraction()
  {
    System.out.print(numerator + "/" + denominator);
  }
  
  public static void main(String[] args) {
    Fraction fractionOne;
    Fraction fractionTwo;
    Fraction answer;
    fractionOne = new Fraction(3,4);
    fractionTwo = new Fraction(7,19);
    answer = fractionOne.multiply(fractionTwo);
    answer.printFraction();
  }
}
