package factory;

public class App {

  public static void main(String[] args) {

    Hero sniper = HeroFactory.getHero("Sniper");
    Hero axe = HeroFactory.getHero("Axe");
    printHeroDetails(sniper);
    printHeroDetails(axe);
  }


  private static void printHeroDetails(Hero hero){
    System.out.println(hero.getName());
    System.out.println("Agi : " + hero.getAgi());
    System.out.println("Str : " + hero.getStr());
  }
}
