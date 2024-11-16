package p3_generics;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("apple");
    stringList.add("banana");
    stringList.add("orange");

    // コンパイル時に型安全性が確保される
    String fruit = stringList.get(0);

    System.out.println(fruit);

  }
}
