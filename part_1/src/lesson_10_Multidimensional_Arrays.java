public class lesson_10_Multidimensional_Arrays {
    public static void main(String[] args) {
        float[] array_1 = new float[] {12.12f, 23.23f}; //array
        float[][] array_2 = new float[][]{{222.12f, 333.13f},{555.15f, 666.16f}};

        char[][] array_3 = new char[3][];
        for (int i = 0; i < array_3.length; i++)
            array_3[i] = new char[3];
        array_3[0][0] = 'C';
        System.out.print(array_3[0][0]);

    }
}
