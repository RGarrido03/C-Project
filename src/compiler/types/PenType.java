package types;

public class PenType extends Type{

    public PenType(){super("pen");}

    @Override
    public Boolean toBoolean(Object value) {
        throw new IllegalArgumentException("Pen cannot be cast to any other type");
    }

    @Override
    public Integer toInteger(Object value) {
        throw new IllegalArgumentException("Pen cannot be cast to any other type");
    }

    @Override
    public Double toReal(Object value) {
        throw new IllegalArgumentException("Pen cannot be cast to any other type");
    }

    @Override
    public String toString(Object value) {
        // TODO: Implement this
        return "";
    }
}
