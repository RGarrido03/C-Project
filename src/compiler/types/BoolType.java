package types;

/**
 * BoolType
 */
public class BoolType extends Type {

  public BoolType() {
    super("bool");
  }


  @Override
  public Boolean toBoolean(Object value) {
    return (Boolean) value;
  }

  @Override
  public Integer toInteger(Object value) {
    boolean bool = (boolean) value;
    return bool ? 1 : 0;
  }

  @Override
  public Double toReal(Object value) {
    boolean bool = (boolean) value;
    return bool ? 1.0 : 0.0;
  }

  @Override
  public String toString(Object value) {
    return ((Boolean) value).toString();
  }
}
