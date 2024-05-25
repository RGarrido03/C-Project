package types;

/**
 * StringType
 */
public class StringType extends Type {

  public StringType() {
    super("string");
  }

  @Override
  public Boolean toBoolean(Object value) {
    String str = (String) value;
    if (str.equalsIgnoreCase("true")) {
      return true;
    }
    if (str.equalsIgnoreCase("false")) {
      return false;
    }
    throw new IllegalArgumentException("String is not 'true' or 'false', to be cast");
  }

  @Override
  public Integer toInteger(Object value) {
    String str = (String) value;
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("String is not an integer");
    }
  }

  @Override
  public Double toReal(Object value) {
    String str = (String) value;
    try {
      return Double.parseDouble(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("String is not a real");
    }
  }

  @Override
  public String toString(Object value) {
    return (String) value;
  }
}
