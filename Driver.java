package assignment01;
import java.time.LocalDate;

public class Driver {

  public static void main (String[] args){ //what am i putting here??

    Person myperson1 = new Person("Ariel",3,2,1); //dont i also need day month year??

    Person myperson2 = new Person("Britany",3,2,1);
    Person myperson3 = new Person("Hailey",3,2,1);
    Person myperson4 = new Person("Saro",3,2,1);

    Highschool myhighschool1 = new Highschool("Whitman");
    Highschool myhighschool2 = new Highschool("Maine");
    Highschool myhighschool3 = new Highschool("Endwell");


    HighSchoolStudent myhighschoolstudent1 = new HighSchoolStudent(myhighschool1);
    HighSchoolStudent myhighschoolstudent2 = new HighSchoolStudent(myhighschool2);
    HighSchoolStudent myhighschoolstudent3 = new HighSchoolStudent(myhighschool3);

    University myuniversity1 = new University("Binghamton","Vestal, NY");
    University myuniversity1 = new University("Duke","Durham, NC");

    UniversityStudent myuniversitystudent1 = new UniversityStudent();
    myuniversitystudent1.goToUniversity(myhighschoolstudent1);
    UniversityStudent myuniversitystudent2 = new UniversityStudent();
    myuniversitystudent2.goToUniversity(myhighschoolstudent2);

    Company mycompany1 = new Company();

    Employee myemployee1 = myuniversitystudent1.getAJob(mycompany1, 1000000);

    myperson1.printHistory();
    System.out.println("---------------------");
    myperson2.printHistory();
    System.out.println("---------------------");
    myperson3.printHistory();
    System.out.println("---------------------");
    myperson4.printHistory();
    System.out.println("---------------------");

  }

}
