import java.util.*;

import static java.lang.Math.abs;


public class Main {
    public static Vector<Integer> subsize(int[] vector2, int size, int starting) {
        Vector<Integer> vector1 = new Vector<Integer>();
        for(int n: vector2) {
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
            limit = (size % 2 == 0) ? size / 2: ((size - 1) / 2);
        }


        for (int i = 0; i < limit; i++) {

            value += abs(subset.get(i) - subset.get(size - i - 1));
        }

        return value;
    }
    public static int findMin(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum if a smaller element is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numMountains = input.nextInt();
        input.nextLine();

        int[] arr = new int[numMountains];

        String tempInput=input.nextLine();

        String[] arrofStr= tempInput.split(" ");

        int index = 0;

        for(String element : arrofStr) {

            arr[index] = Integer.parseInt(element);
            index+=1;
        }

        Vector<int[]> values = new Vector<>();
        Vector<Integer> answers = new Vector<>();
        // -----

        int[] bottom = new int[arr.length-1];

        for (int i = 0; i < bottom.length; i++) {
            bottom[i] = asymmetric(subsize(arr, 2, i));

        }


//        for (int element: bottom) {
//            System.out.print(element + " ");
//        }
//        System.out.println();

        // ---------------------------------

        int[] bottom1 = new int[arr.length-2];

        for (int i = 0; i < bottom.length-1; i++) {
            bottom1[i] = bottom[i] + bottom[i+1];

        }

        values.add(bottom);
        values.add(bottom1);
        // =-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-

        for (int k = 0;; k++) {
            numMountains -= 1;
            if (numMountains == 2) {
                break;
            }
            int[] newArray = new int[abs(values.get(values.size()-1).length-1)];

            int[] malleuable = values.get(values.size()-2);

            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = malleuable[i + 1] + abs(arr[i + 3 + k] - arr[i]);
                System.out.println(newArray[i]);
            }

            values.add(newArray);


        }
        //

        answers.add(0);
        values.removeElementAt(values.size()-1);
        for (int[] elements: values) {

            for(int element: elements) {
                System.out.print(element+" ");
            }
            System.out.println(" The minimum is " + findMin(elements));
        }

        for (int element : answers) {
            System.out.print(element + " ");
        }
        System.out.println();

//        int[] even4 = new int[bottom.length-2];
//
//        for (int i = 0; i < even4.length; i++) {
//            even4[i] = bottom[i+1] + abs(arr[i+3] - arr[i]);
//
//        }
//
//        System.out.println(findMin(even4));
//
//        // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
//        int[] odd5 = new int[bottom1.length-2];
//
//        for (int i = 0; i < odd5.length; i++) {
//            odd5[i] = bottom1[i+1] + abs(arr[i+4] - arr[i]);
//
//        }


    }
}
