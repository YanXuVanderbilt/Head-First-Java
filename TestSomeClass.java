class SomeClass 
{
  private String myName;
  
  //postcondition: returns myName
  public String getName()
  {
    return myName;
  }
  
  //postcondition:myName == name
  public void setName(String name) 
  { 
    myName = name;
  }
  
  // ...constructors, other methods and private data not shown
}

public class TestSomeClass {
  public static void main(String[] args) {
    TestSomeClass testSomeClass = new TestSomeClass();
    SomeClass someClass1 = new SomeClass();
    SomeClass someClass2 = new SomeClass();
    someClass1.setName("C1");
    someClass2.setName("C2");
    System.out.println(someClass1.getName() + someClass2.getName());
    testSomeClass.swap(someClass1, someClass2);
    System.out.println(someClass1.getName() + someClass2.getName());
  }
  
  //precondition: x and y are correctly constructed
  //postcondition: the names of objects x and y are swapped  
  public void swap (SomeClass x, SomeClass y)  
  {
    String temp;
    temp = x.myName;
    x.myName = y.myName;
    y.myName = temp;
  }
}