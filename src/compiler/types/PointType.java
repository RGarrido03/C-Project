package types;

public class PointType extends Type {

    public PointType() {
        super("point");
    }

    @Override
    public Boolean toBoolean(Object value) {
        throw new IllegalArgumentException("Point " + super.NO_POSSIBLE_CAST);
    }

    @Override
    public Integer toInteger(Object value) {
        throw new IllegalArgumentException("Point " + super.NO_POSSIBLE_CAST);
    }

    @Override
    public Double toReal(Object value) {
        throw new IllegalArgumentException("Point " + super.NO_POSSIBLE_CAST);
    }

    @Override
    public String toString(Object value) {
        // TODO: Implement this
        return "";
    }
}
