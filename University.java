package assignment01;

public class University {

  private String name;
  private String city;

  public University(String uName, String uCity){
    name = uName;
    city = uCity;
  }

  public String getName(){
    return name;
  }

  public String getCity(){
    return city;
  }
}
