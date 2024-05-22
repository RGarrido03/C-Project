package types;

/**
 * Type
 */
public abstract class Type {

  private final String type; // TODO see if should be final

  public Type(String type) {
    this.type = type;
  }

  public String toString() {
    return type;
  }

  public boolean isNumeric() {
    return false;
  }
}
