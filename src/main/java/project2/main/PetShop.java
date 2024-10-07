package project2.main;

import project2.enums.PetType;

public class PetShop {

	public static void main(String[] args) {
		/**
		 * PetType Enumのすべての値をループし、
		 * 各ペット種類の名前と平均寿命を表示する
		 */
		for (PetType pet : PetType.values()) {
			System.out.println("ペットの種類の名前: " + pet.name());
			System.out.println("ペットの種類の平均寿命: " + pet.getLifespan());
			System.out.println("---");
		}
	}

}
