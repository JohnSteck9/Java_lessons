package Lesson_13_class_and_object;

public class Main {
    public static void main(String[] args) {
        Person vitya = new Person();    // vitya - object
        System.out.println(vitya.height); // Person - class
        vitya.height = 120;
        System.out.println(vitya.height);

        Person liza = new Person();
        System.out.println(liza.height);
        liza.say("Bob");
    }
}
