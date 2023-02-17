package bitcamp.backend.child;

public class App {
  public static void main(String arg[]) {
    Student stu = new Student("학생1", 13);
    System.out.println(stu.getName() + " " + stu.getAge());
  }
}
