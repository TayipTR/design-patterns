public abstract class Hero {

  private String name;
  private int agility;
  private int strength;
  private int intelligence;

  Hero(String name, int agility, int strength, int intelligence) {
    this.name = name;
    this.agility = agility;
    this.strength = strength;
    this.intelligence = intelligence;
  }

  public String getName() {
    return name;
  }

  public int getAgility() {
    return agility;
  }

  public int getStrength() {
    return strength;
  }

  public int getIntelligence() {
    return intelligence;
  }
}
