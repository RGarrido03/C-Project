package types;

public class FractionType extends Type {

  public FractionType() {
    super("fraction");
  }

  @Override
  public boolean isNumeric() {
    return true;
  }
}
