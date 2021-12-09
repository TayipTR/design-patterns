public class DotaSearchBuilder {

  static class GameSearch {

    private String gameMode;
    private String region;
    private String languge;

    private GameSearch(Builder builder) {
      this.gameMode = builder.gameMode;
      this.languge = builder.languge;
      this.region = builder.region;
    }

    static class Builder {

      private String gameMode;
      private String region;
      private String languge;

      public Builder(String gameMode) {
        this.gameMode = gameMode;
      }

      public Builder region(String region) {
        this.region = region;
        return this;
      }

      public Builder language(String languge) {
        this.languge = languge;
        return this;
      }

      public GameSearch build() {
        return new GameSearch(this);
      }
    }

    @Override
    public String toString() {
      return String.format("Search [mode=%s, region=%s, language=%s]", this.gameMode, region, languge);
    }
  }
}
