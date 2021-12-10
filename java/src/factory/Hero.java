package factory;

public class Hero {
  private String name;
  private int agi;
  private int str;

  public Hero(String name, int agi, int str){
    this.name = name;
    this.agi = agi;
    this.str = str;
  }

  public String getName() {
    return name;
  }

  public int getAgi() {
    return agi;
  }

  public int getStr() {
    return str;
  }
}
