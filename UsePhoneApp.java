public class UsePhoneApp
{
  public void UsePhoneApp()  // just do it, we'll explain later
  {
    Phone myPhone = new Phone();
    myPhone.downloadApp();
    myPhone.openApp();
    myPhone.closeApp();
  }
  
  public static void main(String[] args) {
    UsePhoneApp usePhoneApp = new UsePhoneApp();
    usePhoneApp.UsePhoneApp();
  }
}

