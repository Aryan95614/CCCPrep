import java.util.*;


public class prob2 {
    public static Vector<Integer> subsize(int[] vector2, int size, int starting) {
        Vector<Integer> vector1 = new Vector<Integer>();
        for (int n : vector2) {
            vector1.add(n);
        }
        Vector<Integer> temp = new Vector<Integer>();
        for (int i = 0; i < size; i++) {
            if (i + starting < vector1.size()) {
                temp.add(vector1.get(i + starting));
            } else {
                temp.add(0); // Or some other appropriate value
            }
        }
        return temp;
    }

    public static int asymmetric(Vector<Integer> subset) {
        int value = 0;
        int limit;
        int size = subset.size();
        if (size == 1) {
            return 0;
        } else {
            limit = (size % 2 == 0) ? size / 2 : ((size - 1) / 2);
        }


        for (int i = 0; i < limit; i++) {

            value += Math.abs(subset.get(i) - subset.get(size - i - 1));
        }

        return value;
    }

    public static void main(String[] args) {
        final int numMountains = 8;
        int[] arr = {2, 4, 9, 12, 15, 20, 24, 30};

        Vector<int[]> values = new Vector<>();
        // -----

        int[] bottom = new int[arr.length - 1];

        for (int i = 0; i < bottom.length; i++) {
            bottom[i] = asymmetric(subsize(arr, 2, i));

        }


        values.add(bottom);

        for (int element : bottom) {
            System.out.print(element + " ");
        }


        System.out.println();
        int[] bottom1 = new int[arr.length - 2];

        for (int i = 0; i < bottom.length - 1; i++) {
            bottom1[i] = bottom[i] + bottom[i + 1];

        }


        for (int element : bottom1) {
            System.out.print(element + " ");
        }
        System.out.println();
        values.add(bottom1);

        for (int i = 0; i < 5; i++) {
            int value = values.get(0)[1+i];

            value += arr[3+i];
            value -= arr[i];
            System.out.println(value);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            int value = values.get(1)[1+i];

            value += arr[4+i];
            value -= arr[i];
            System.out.println(value);
        }

    }
}
