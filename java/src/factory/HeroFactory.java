package factory;

public class HeroFactory {

  public static Hero getHero(String name) {
    if (name.equals("Sniper")) {
      return new Sniper();
    } else if (name.equals("Axe")) {
      return new Axe();
    } else {
      return null;
    }
  }
}
