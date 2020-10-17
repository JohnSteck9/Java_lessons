import java.util.Scanner;

public class lesson_5_6 {
    public static void  main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Your string: " + str.nextLine());     // nextInt
        //------------------------------------------------------------------

        Scanner num = new Scanner(System.in);

        float first, second, result;      // float
        System.out.print("Enter first num: ");
        first = num.nextFloat();          //nextFloat
        System.out.print("Enter second num: ");
        second = num.nextFloat();         //nextFloat
        result = first + second;          //% остача
        result /= 2;
        result ++;
        result --;
        System.out.println("Result = " + result);
    }
}
