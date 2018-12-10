import java.util.*;

public class Elective 
{
  private String name;
  private int maxClassSize;
  private int classSize;
  private ArrayList studentList = new ArrayList();
  
  //postcondition:returns the name of this Elective
  public String getName()
  { 
    return name;
  }
  
  //postconditionL return the maximum number of Students that can be added to this Elective
  public int getMaxClassSize()
  { 
    return maxClassSize;
  }
  
  //postcondition: return the number of Students that have been added to this Elective;
  //0 <= getClassSize() <= getMaxClassSize()
  public int getClassSize()
  { 
    return classSize;
  }
  
  //precondition: getClassSize() < getMaxClassSize(); s is not null
  //postcondition: s has been added to this Elective; getClassSize() has been increased by 1
  //public void addStudent(Student s)
  //{ 
    //studentList.add(s);
  //}
  
  public Elective(String n, int max)
  {
    name = n;
    maxClassSize = max;
  }
  
  //...constructors, other methods, and other private data not shown
}