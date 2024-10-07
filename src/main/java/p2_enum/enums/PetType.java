package p2_enum.enums;

public enum PetType {
  DOG(12), CAT(14), BIRD(5);

  private final int lifespan;

  PetType(int lifespan) {
    this.lifespan = lifespan;
  }

  public int getLifespan() {
    return lifespan;
  }
}
