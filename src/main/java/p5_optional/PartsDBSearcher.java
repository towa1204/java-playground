package p5_optional;

import java.util.Map;
import java.util.Optional;
import static java.util.Map.entry;

public class PartsDBSearcher {
  public Parts find(String code) {
    var parts = partsDB.get(code);
    return parts;
  }

  public Optional<Parts> find2(String code) {
    var parts = partsDB.get(code);
    return Optional.ofNullable(parts);
  }

  private static Map<String, Parts> partsDB = Map.ofEntries(
      entry("A-001", new Parts("部品A", "A-001", 5)), entry("B-001", new Parts("部品B", "B-001", 10)),
      entry("C-001", new Parts("部品C", "C-001", 10)));
}
