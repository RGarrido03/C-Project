package types;

/**
 * Symbol
 */
public class Symbol {

  private Type type;
  private String name;
  private Object value;

  public Symbol(Type type, String name, String value) {
    this.type = type;
    this.name = name;
    this.value = value;
  }

  public Symbol(Type type, String name) {
    this.type = type;
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public Object getValue() {
    return value;
  }

  public String toString() {
    return type + " " + name + " " + value;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}
