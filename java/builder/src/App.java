
public class App {

  public static void main(String[] args) {
    DotaSearchBuilder.GameSearch gameSearch = new DotaSearchBuilder
        .GameSearch
        .Builder("All Pick")
        .language("TR")
        .region("Europe")
        .build();
    System.out.println(gameSearch.toString());

    gameSearch = new DotaSearchBuilder
        .GameSearch
        .Builder("Turbo")
        .language("CH")
        .region("China")
        .build();
    System.out.println(gameSearch.toString());
  }
}
