package types;

/**
 * IntType
 */
public class IntType extends Type {

  public IntType() {
    super("int");
  }

  public boolean isNumeric() {
    return true;
  }
}
