import java.util.*;

public class School
{
  private ArrayList<Student> studentList;
  //each entry is an instance of a Student representing one student at the school, students are in the order they should be scheduled
  
  private ArrayList<Elective> electiveList;
  //each entry is an instance of an Elective representing one elective offered at the school
  
  //precondition: name is the name of an Elective in electiveList
  //postcondition: return the Elective in electiveList with the given name
  private Elective getElectivesByName (String name)
  {
    for (int i = 0; i < this.getElectiveListSize(); i++)
    {
      if (electiveList[i].getName() == name)
      {
        return electiveList[i];
      }
    }
  }
  
  //postcondition: returns the size of electiveList
  private int getElectiveListSize()
  {
    return electiveList.size();
  }
  
  private int getStudentListSize()
  {
    return studentList.size();
  }
  
  //postcondition: All students in studentList have been either assigned their first 
  //               available elective choice or not assigned; All Electives in
  //               electiveList have been updated appropriately as Students are assigned
  //               to them
  public void assignElectivesToStudents()
  { /* to be implemented in part (c) */}
  
  //...constructors, other methods, and other private data not shown
}