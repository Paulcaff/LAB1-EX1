public class ArrayDriver {
    public static void main(String[] args) {

        int[] values = new int[10];
        values[0] = 2;
        values[1] = 4;
        values[2] = 6;
        values[3] = 8;
        values[4] = 10;

        MyArrays.insert(values,5,2,5);
        for(int i = 0; i < values.length; i++){

            System.out.println(values[i]);
        }
    }
}
