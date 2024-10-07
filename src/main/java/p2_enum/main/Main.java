package p2_enum.main;

import p2_enum.enums.FruitType;
import p2_enum.enums.PetType;

public class Main {

  public static void main(String[] args) {
    /**
     * PetType Enumのすべての値をループし、 各ペット種類の名前と平均寿命を表示する
     */
    System.out.println("##############################");
    System.out.println("PetType");
    System.out.println("##############################");

    for (PetType pet : PetType.values()) {
      System.out.println("ペットの種類の名前: " + pet.name());
      System.out.println("ペットの種類の平均寿命: " + pet.getLifespan());
      System.out.println("---");
    }

    /**
     * switch式 & enumのマッチング
     */
    System.out.println("##############################");
    System.out.println("FruitType");
    System.out.println("##############################");

    var fruit = FruitType.APPLE;
    var famousPrefecture = switch (fruit) {
      case APPLE -> "青森";
      case GRAPE -> "山梨";
      case PEACH -> "山梨";
    };
    System.out.println(fruit + "の有名な県: " + famousPrefecture);
  }

}
