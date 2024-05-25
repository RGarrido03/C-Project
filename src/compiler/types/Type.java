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

  public String NO_POSSIBLE_CAST = "cannot be cast to any other type";

  public abstract Boolean toBoolean(Object value);
  public abstract Integer toInteger(Object value);
  public abstract Double toReal(Object value);
  public abstract String toString(Object value);
}
