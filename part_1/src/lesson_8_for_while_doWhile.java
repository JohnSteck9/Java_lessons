public class lesson_8_for_while_doWhile {
    public static void  main(String[] args) {
        // int i;
        // for (int i = 100; i > 10; i-=10;){}
        for (int i = 0; i <= 10; i++)
            System.out.println(i);

        boolean isTrue = true;
        int j = 0;
        while (j < 20) {    //true
            System.out.println(j);
            j += 1;
            if (j % 2 == 0)
                continue;
            if (j > 10)
                isTrue = false;
                // break;
                // return;
                // continue;
        }


        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while (x < 0);
    }
}
