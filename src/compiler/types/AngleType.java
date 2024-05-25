package types;

/**
 * AngleType
 */
public class AngleType extends Type {

  public AngleType() {
    super("angle");
  }

  @Override
  public Boolean toBoolean(Object number) {
    double real = (double) number;
    if (real == 1.0) {
      return true;
    }
    if (real == 0.0) {
      return false;
    }
    throw new IllegalArgumentException("Angle to cast to bool is not 0 or 1");
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
    return ((Double) value).toString();
  }
}
