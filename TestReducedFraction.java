class ReducedFraction extends Fraction
  { 
    int reducedNumerator;
    int reducedDenominator;
    
    public ReducedFraction() 
    {
      reducedNumerator = 0;
      reducedNumerator = 1;
    }
    
    public ReducedFraction(int n, int d)
    {
      super(n,d);
      reducedNumerator = n / gcd(n,d);
      reducedDenominator = d / gcd(n,d);
    }
  }

public class TestReducedFraction {
  public static void main(String[] args) {
    ReducedFraction testReducedFraction = new ReducedFraction(44,55);
    System.out.print(testReducedFraction.reducedNumerator + "/" + testReducedFraction.reducedDenominator);
  }
}
    