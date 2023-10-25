
import java.util.*;


public class prob1 {
    public static void printArray(Vector<Integer>[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("\n < -- > ");

            System.out.print(arr[i]);
        }
        System.out.println(); // Print a newline to complete the output
    }

    public static Vector<Vector<Vector<Integer>>> addAll(int size, Vector<Vector<Vector<Integer>>> arr, Vector<Integer> inputs, int starting) {
        for(int i = 0; i < size-1; i++) {
            Vector<Integer> paths = new Vector<Integer>();

            for (int j = 1; j <= size - i; j++) {
                paths.add(inputs.get(j - 1));
            }
            arr.get(size-paths.size()+starting).add(paths);
        }

        return arr;
    }

    public static void main(String[] args) {
        int size = 7;
        final int result = size;
        Vector<Integer> inputs = new Vector<Integer>(){{
            for(int i = 0; i < 7; i++) {
                add(i);
            }
        }};

        Vector<Vector<Vector<Integer>>> arr = new Vector<>();
        for (int i = 0; i < size; i++) {
            arr.add(new Vector<>());
        }

        for(int k = 0; k < result;k++){
            arr = addAll(size, arr, inputs, k);

            inputs.removeElementAt(0);
            size -= 1;
        }
            //        arr = addAll(size, arr, inputs, 0);
            //
            //        inputs.removeElementAt(0);
            //        size -= 1;
            //        arr = addAll(size, arr, inputs, 1);

        for(Vector<Vector<Integer>> element : arr) {
            System.out.println(element);
        }


    }
}
