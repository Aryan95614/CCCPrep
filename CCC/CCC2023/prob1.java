
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
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.nextLine();
        final int result = size;
/*
7
2 4 9 12 15 20 24
 */

        Vector<Integer> inputs = new Vector<Integer>();

        String tempInput=input.nextLine();

        String[] arrofStr= tempInput.split(" ");

        for(String element : arrofStr) {

            inputs.add(Integer.parseInt(element));
        }

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
