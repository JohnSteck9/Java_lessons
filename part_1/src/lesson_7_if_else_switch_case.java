import java.util.Scanner;

public class lesson_7_if_else_switch_case {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second=50;
        boolean isTrue = true;
        System.out.print("Enter first num: ");

        first = num.nextInt();

//        if (first == 10)    //True
//            System.out.println("Num is 10");

        second = first == 51 ? 23 : 45;     // if first = 51 then = 23 else = 45

        if(first >= second && isTrue) {         // && -> and        || -> or
            System.out.println(">= second: " + first);
            System.out.print("\n");
        } else if (first == 45)
            System.out.print("Num = 45");
        else {
            System.out.print("Num is lower than " + second);
        }

        switch (first) {
            case 51 -> System.out.print("Num = 51");
            case 48 -> System.out.print("Num = 48");
            default -> System.out.print("qwerty");
        }
//        switch (first) {
//            case 51:
//                System.out.print("Num = 51");
//                break;
//            case 48:
//                System.out.print("Num = 48");
//                break;
//            default:
//                System.out.print("qwerty");
//        }
    }
}
