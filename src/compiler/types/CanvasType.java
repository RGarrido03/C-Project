package types;

public class CanvasType extends Type {

  public CanvasType(String tad) {
    super(tad);
  }

  @Override
  public Boolean toBoolean(Object value) {
    throw new IllegalArgumentException("Canvas " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public Integer toInteger(Object value) {
    throw new IllegalArgumentException("Canvas " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public Double toReal(Object value) {
    throw new IllegalArgumentException("Canvas " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public String toString(Object value) {
    throw new IllegalArgumentException("Canvas " + super.NO_POSSIBLE_CAST);
  }
}
