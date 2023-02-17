package bitcamp.backend.child;

import bitcamp.backend.parent.Man;

public class Student extends Man {

  @Override
  public int getAge() {
    return super.getAge() + 5;
  }

  public Student(String name, int age) {
    super(name, age);
  }

}
