public class MyArraysDriver {
    public static void main(String[] args) {
        int[] values = new int[10];
        values[0] = 34;
        values[1] = 34;
        values[2] = 34;

        MyArrays.insert(values,3,2,99);

        System.out.println("Array Contents");

        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

    }
}
