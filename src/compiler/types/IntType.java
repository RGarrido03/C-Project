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

  @Override
  public Boolean toBoolean(Object number) {
    int a = (int) number;
    if (a == 1) {
      return true;
    }
    if (a == 0) {
      return false;
    }
    throw new IllegalArgumentException("Number to cast to bool is not 0 or 1");
  }

  @Override
  public Integer toInteger(Object value) {
    return (Integer) value;
  }

  @Override
  public Double toReal(Object value) {
    return (Double) value;
  }

  @Override
  public String toString(Object value) {
    return ((Integer) value).toString();
  }
}
