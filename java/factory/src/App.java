public class App {

  public static void main(String[] args) {
    Hero axe = new DotaHeroFactory().getHero("Axe");
    Hero sniper = new DotaHeroFactory().getHero("Sniper");

    printHeroDetails(axe);
    System.out.println("-----------");
    printHeroDetails(sniper);
  }

  public static void printHeroDetails(Hero hero) {
    System.out.println(hero.getName());
    System.out.println("agi : " +hero.getAgility());
    System.out.println("str : " +hero.getStrength());
    System.out.println("int : " +hero.getIntelligence());
  }
}
