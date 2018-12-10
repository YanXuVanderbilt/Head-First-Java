public class TestThreads {

  public static void main(String[] args) {

    ThreadOne t1 = new ThreadOne();
    Thread one = new Thread(t1);
    one.start();
    ThreadTwo t2 = new ThreadTwo();
    Thread two = new Thread(t2);
    two.start();
    }
}

class ThreadOne implements Runnable {
  public void run() {
       
    try {
      
      Accum a = Accum.getAccum();
      
      for(int x = 0; x < 99; x++) {
        
        Thread.sleep(50);
        a.updateCounter(1); 
        
      }
      
      System.out.println("one " + a.getCount());
     
    } catch(InterruptedException ex) {}
  } // close run
}

class ThreadTwo implements Runnable {
  public void run() {
    
    try {
    
      Accum a = Accum.getAccum();
          
      for(int x = 0; x < 98; x++) {
        
        a.updateCounter(1000);
        Thread.sleep(50);
        
      }
      
      System.out.println("two " + a.getCount());
      
      
    } catch(InterruptedException ex) {}
        
      }// close run
}
  
class Accum {

  

  private int counter = 0;
  
  private static Accum a = new Accum();
   
  private Accum() {}

  public void updateCounter(int add) {
    
    counter += add;
   
    }
  
  public int getCount() {
    
      return counter;
    
    }
    
    
  public static Accum getAccum() {
    return a;
  }
  
} // close class
    