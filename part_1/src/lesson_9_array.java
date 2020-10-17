import java.util.Scanner;

public class lesson_9_array {
    public static void main(String[] args) {
        int[] test;     //array
        test = new  int[5];

        int[] name = new int[5];    //array
        name[0] = 11;
        name[1] = 22;
        name[2] = 33;
        name[3] = 44;
        name[4] = 55;

        float[] name_2 = new float[] {11f, 12.2f, 13f};
        System.out.println(name_2[1] + name_2[0]);    // 23.2
        // --------------------------------------------
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of array: ");
        n = in.nextInt();
        a = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt ();
        }

    }
}
