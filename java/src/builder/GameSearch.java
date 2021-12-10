package builder;

public class GameSearch {

  private String mode;
  private String region;
  private String language;

  public GameSearch(Builder builder) {
    this.mode = builder.mode;
    this.region = builder.region;
    this.language = builder.language;
  }

  static class Builder {

    private String mode;
    private String region;
    private String language;

    public Builder(String mode) {
      this.mode = mode;
    }

    public Builder region(String region) {
      this.region = region;
      return this;
    }


    public Builder language(String language) {
      this.language = language;
      return this;
    }

    public GameSearch build() {
      return new GameSearch(this);
    }
  }

  @Override
  public String toString() {
    return String.format("Game : [mode: %s], [region: %s], [language: %s]", mode, region, language);
  }
}

