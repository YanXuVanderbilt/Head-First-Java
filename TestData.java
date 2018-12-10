import java.util.*;

public class TestData 
{

  // instantiate Electives
  Elective astronomy = new Elective("Astronomy", 2);
  Elective ballroomDance = new Elective("Ballroom Dance", 2);
  Elective basketWeaving = new Elective("Basketweaving", 2);
  Elective constitutionalLaw = new Elective("Constitutional Law", 2);
  Elective marineBiology = new Elective("Marine Biology", 2);
  Elective programming = new Elective("Programming", 2);
  
  //instantiate Students' personalList
  ArrayList amyList = new ArrayList<Elective>();
  amyList.add(astronomy);
  amyList.add(basketWeaving);
  amyList.add(marineBiology);
  
  ArrayList<Elective> andrewList = new ArrayList<Elective>();
  andrewList.add(programming);
  andrewList.add(marineBiology);
  andrewList.add(ballroomDance);
  
  ArrayList<Elective> bellList = new ArrayList<Elective>();
  bellList.add(astronomy);
  bellList.add(basketWeaving);
  bellList.add(programming);
  
  ArrayList<Elective> billList = new ArrayList<Elective>();
  billList.add(ballroomDance);
  billList.add(constitutionalLaw);
  billList.add(programming);
  
  ArrayList<Elective> cathyList = new ArrayList<Elective>();
  cathyList.add(basketball, marineBiology, programming);
  
  ArrayList<Elective> claudineList = new ArrayList<Elective>();
  claudineList.add(ballroomDance, constitutionalLaw, programming);
  
  ArrayList<Elective> danielList = new ArrayList<Elective>();
  danielList.add(marineBiology, astronomy, basketWeaving);
  
  ArrayList<Elective> davidList = new ArrayList<Elective>();
  davidList.add(constitutionalLaw, basketWeaving, programming);
  
  ArrayList<Elective> elizabethList = new ArrayList<Elective>();
  elizabethList.add(marineBiology, programming, astronomy);
  
  ArrayList<Elective> ethanList = new ArrayList<Elective>();
  ethanList.add(basketWeaving, marineBiology, Astronomy);
  
  ArrayList<Elective> frankList = new ArrayList<Elective>();
  frankList.add(constitutionalLaw, ballroomDance, programming);
  
  ArrayList<Elective> katharineList = new ArrayList<Elective>();
  katharineList.add(programming, basketWeaving, marineBiology);
  
  
  //instantiate Students
  Student amy = new Student("Amy", amyList);
  Student andrew = new Student("Andrew", andrewList);
  Student bell = new Student("Bell", bellList);
  Student bill = new Student("Bill", billList);
  Student cathy = new Student("Cathy", cathyList);
  Student claudine = new Student("Claudine", claudineList);
  Student daniel = new Student("Daniel", danielList);
  Student david = new Student("David", davidList);
  Student elizabeth = new Student("Elizabeth", elizabethList);
  Student ethan = new Student("Ethan", ethanList);
  Student frank = new Student("Frank", frankList);
  Student katharine = new Student("Katharine", katharineList);
  
  public ArrayList<Elective> makeElectiveList() 
  {
    ArrayList<Elective> electiveList = new ArrayList<Elective>();
    electiveList.add(astronomy, ballroomDance, basketWeaving, constitutionalLaw, marineBiology, programming);
    return electiveList;
  }
  
  public ArrayList<Student> makeStudentList()
  {
    ArrayList<Student> studentList = new ArrayList<Student>();
    studentList.add(amy,andrew,bell,bill,cathy,claudine,daniel,david,elizabeth,ethan,frank,katharine);
    return studentList;
  }

  public static void main(String[] args) 
  {
    TestData data = new Data();
  }
}
