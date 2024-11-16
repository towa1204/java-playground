package p5_optional;

public class Main {
  public static void main(String[] args) {
    var searcher = new PartsDBSearcher();
    var parts = searcher.find("xxx");
    System.out.println(parts);

    var parts2 = searcher.find2("xxx").orElseThrow(); // Exception発生
    System.out.println(parts);
  }
}
