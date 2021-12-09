public class DotaHeroFactory {

  Hero getHero(String type) {
    if (type.equals("Sniper")) {
      return new Sniper();
    } else if (type.equals("Axe")) {
      return new Axe();
    } else {
      return null;
    }
  }
}
