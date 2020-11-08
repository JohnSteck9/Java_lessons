import  java.util.Scanner;

public class lesson_11_functions {
    public static void main(String[] args) {
    // void - type of func return result void = None
        int temp = func(3,4);
        System.out.println(temp);

        func_2(3,4);
        readArray();

    }
    public static int func (int a, int b) {
        int result = 1;
        for(int i = 0; i < b; i++)
            result *= a;
        return result;
    }
    public static void func_2 (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result += a;
        System.out.println(result);
    }
    public static int[] readArray () {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(arr[0] + arr[1]);
        return arr;
    }
}
