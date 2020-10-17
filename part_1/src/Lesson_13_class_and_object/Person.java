package Lesson_13_class_and_object;

public class Person {
    public int height = 180;

    public void say (String name) {
        System.out.printf("Hello, " + name);
    }

 // default constructor  public Person () {}
 public Person (int h) {
        height = h;

 }
}
