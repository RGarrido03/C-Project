package types;

public class FunctionType extends Type {

  public FunctionType(String name) {
    super(name);
  }

  @Override
  public Boolean toBoolean(Object value) {
    throw new IllegalArgumentException("Function " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public Integer toInteger(Object value) {
    throw new IllegalArgumentException("Function " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public Double toReal(Object value) {
    throw new IllegalArgumentException("Function " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public String toString(Object value) {
    throw new IllegalArgumentException("Function " + super.NO_POSSIBLE_CAST);
  }
}
