public class Phone 
{
  private boolean hasApp;
  public void phone()
  {
    hasApp = false;
  }
  public void downloadApp()
  {
    hasApp = true;
  }
  
  public void closeApp() // close the app
  {
    if(hasApp)
      System.out.println ("App is closed.");
  }
  
  public void openApp() // open the app
  {
    if (hasApp)
      System.out.println ("App is running...");
  }
}