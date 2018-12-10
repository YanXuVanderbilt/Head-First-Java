class Fish
{
  public String endoskeleton = "bone";
  
  public void action()
  {
    System.out.println("splash splash");
  }
}

class Shark extends Fish
{
  public void action()
  {
    System.out.println("chomp chomp");
  }
  
  public String endoskeleton = "cartilage";
}

public class P042304 {
  public static void main(String[] args) {
    Fish Bob = new Shark();
    System.out.println(Bob.endoskeleton);
    Bob.action();
  }
}