package assignment01;

public class HighSchoolStudent {

  private HighSchool highschool;
  private Person person;

  public HighSchoolStudent(Highschool hsHighschool, Person hsPerson){
    highschool = hsHighschool;
    person = hsPerson;
    person.getHistory()[0] = this;
  }

  public String getHighschool(){
    return highschool;
  }

  public String getPerson(){
    return person;
  }

  public UniversityStudent goToUniversity(University univ){
    return UniversityStudent(univ, person);
  }

}
