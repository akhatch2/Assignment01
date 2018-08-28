package assignment01;

public class Company {

  private String name;
  private String city;

  public Company(String cName, String cCity){
    name = cName;
    city = cCity;
  }

  public String getName(){
    return name;
  }

  public String getCity(){
    return city;
  }

}
