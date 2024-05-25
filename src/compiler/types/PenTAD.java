package types;

public class PenTAD extends Type {

  public PenTAD(String tad) {
    super(tad);
  }

  @Override
  public Boolean toBoolean(Object value) {
    throw new IllegalArgumentException("Pen " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public Integer toInteger(Object value) {
    throw new IllegalArgumentException("Pen " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public Double toReal(Object value) {
    throw new IllegalArgumentException("Pen " + super.NO_POSSIBLE_CAST);
  }

  @Override
  public String toString(Object value) {
    throw new IllegalArgumentException("Pen " + super.NO_POSSIBLE_CAST);
  }
}
