package builder;

public class App {

  public static void main(String[] args) {
    GameSearch search = new GameSearch.Builder("All Pick").build();
    System.out.println(search.toString());

    search = new GameSearch.Builder("Random Pick").region("Europe").language("TR").build();
    System.out.println(search.toString());
  }

}
