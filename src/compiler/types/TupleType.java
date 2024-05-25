package types;

public class TupleType extends Type {

    public TupleType() {
        super("tuple");
    }

    @Override
    public Boolean toBoolean(Object value) {
        throw new IllegalArgumentException("Tuple cannot be cast to any other type");
    }

    @Override
    public Integer toInteger(Object value) {
        throw new IllegalArgumentException("Tuple cannot be cast to any other type");
    }

    @Override
    public Double toReal(Object value) {
        throw new IllegalArgumentException("Tuple cannot be cast to any other type");
    }

    @Override
    public String toString(Object value) {
        // TODO: Implement this
        return "";
    }
}
