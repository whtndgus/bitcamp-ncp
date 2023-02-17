package bitcamp.myapp;

public class Dode {
  Object value;
  Dode next = null;

  public Dode(Object value) {
    super();
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
