package p4_record;

public class Main {
  public static void main(String[] args) {
    /**
     * レコードクラスはイミュータブル（変更不可）
     */

    var parts = new Parts("部品A", "A-001", 5);
    var partsSub = new Parts("部品A", "A-001", 5);

    System.out.println(parts);

    System.out.println("部品の個数: " + parts.qty());

    System.out.println("parts == partsSub: " + parts.equals(partsSub));

  }
}
