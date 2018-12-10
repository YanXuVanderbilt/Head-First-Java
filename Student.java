import java.util.*;

public class Student
{
  String name;
  Elective result = null;
  ArrayList<String> personalList = new ArrayList<String>();
  
  //precondition: 0<=index<3
  //postcondition: returns the name of the given elective choice
  //public String getChoice(int index) 
  //{ 
    //return personalList[index];
  //}
  
  //postcondition: returns true if an Elective has been assigned to this Student
  public boolean hasElective()
  { 
    if (result != null)
    { 
      return true;
    }
    else 
    { 
      return false;
    }
  }
  
  //precondition: e is not null
  //postconditon: e has been assigned to this Student; e has not been modified
  public void assignElective(Elective e) 
  { 
    result = e;
  }
  
  public Student(String n, ArrayList<String> plist)
  {
    name = n;
    personalList = plist;
  }
  
  // ... constructors, other methods, and other private data not shown
}