package assignment01;

public class UniversityStudent {

  private University university;
  private Person person;

  public UniversityStudent(University usUniversity, Person usPerson){
    university = usUniversity;
    person = usPerson;
    person.getHistory()[1] = this;
  }

  public String getUniversity(){
    return university;
  }

  public String getPerson(){
    return person;
  }

  public Employee getAJob(Company comp, double startingSalary){
    return Employee(comp, startingSalary, person);
  }

}
