package assignment01;

public class Employee {

  private Company company;
  private double salary;
  private Person person;

  public Employee(Company eCompany, double eSalary, Person ePerson){
    company = eCompany;
    salary = eSalary;
    person = ePerson;
    person.getHistory()[2] = this;
  }

  public Company getCompany(){
    return company;
  }

  public double getSalary(){
    return salary;
  }

  public Person getPerson(){ //isnt it weird cause there is aother thing named exactly the same??
    return person;
  }

  public void setSalary(double newsalary){
    salary = newsalary;
  }

}
