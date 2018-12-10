public class P042502 
{
  int speed;
  int fine;
  
  public int Fine()
  {
    if (speed >= 75)
      fine = 300;
    if (speed >= 65 && speed < 75)
      fine = 150;
    if (speed > 55 & speed < 65)
      fine = 100;
    return fine;
  }
      
  public static void main(String[] args) 
  {
    P042502 p042502 = new P042502();
    p042502.speed = 60;
    System.out.println(p042502.Fine());
  }
}
    