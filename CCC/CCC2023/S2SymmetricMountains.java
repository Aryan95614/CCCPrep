import java.util.Scanner;
import java.util.Vector;
import java.util.*;
class Main {
    public static int findMinValue(Vector<Integer> vector) {
        int minValue = vector.get(0);

        for (int i = 1; i < vector.size(); i++) {
            int currentValue = vector.get(i);
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }

        return minValue;
    }
    public static Vector<Integer> subsize(Vector<Integer> vector1, int size, int starting) {
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

            value += Math.abs(subset.get(i) - subset.get(size - i - 1));
        }

        return value;
    }
    public static int asymmetric(List<Integer> subset) {
        int value = 0;
        int limit;
        int size = subset.size();
        if (size == 1) {
            return 0;
        } else {
            limit = (size % 2 == 0) ? size / 2: ((size - 1) / 2);
        }


        for (int i = 0; i < limit; i++) {

            value += Math.abs(subset.get(i) - subset.get(size - i - 1));
        }

        return value;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numMountains = 0;
        System.out.print("");
        numMountains = input.nextInt();

        Vector<Integer> heights = new Vector<Integer>();
        Vector<Integer> outputs = new Vector<Integer>();

        input.nextLine();
        String tempInput=input.nextLine();


        String[] arrofStr= tempInput.split(" ");

        for(String element : arrofStr) {

            heights.add(Integer.parseInt(element));
        }

        outputs.add(0);


//        for (int sizes = 2; sizes < 200; sizes++) {
//            Vector<Integer> temp1 = new Vector<Integer>();
//            for (int startings = 0; startings < numMountains - sizes; startings += 1) {
//                Vector<Integer> temp = subsize(heights, sizes, startings);
//                temp1.add(asymmetric(temp));
//            }
//            System.out.println("Added an element");
//            outputs.add(findMinValue(temp1));
//        }
/*
7
3 1 4 1 5 9 2 */

        Vector<Vector<Integer>> iterations;

        for(int i = heights.size(); i > 1; i--) {
            int value = asymmetric(heights.subList(0, i-1));
            System.out.println(value);
        }

        for (int element : outputs) {
            System.out.print(element + " ");
        }
        System.out.println();




    }


}

/*
298
0 1 1 1 0 1 0 0 1 1 0 1 0 0 0 0 0 1 1 1 0 0 1 0 1 0 1 0 0 0 1 0 1 1 1 1 0 1 1 1 0 0 1 1 0 1 0 0 1 0 1 0 1 1 0 1 0 0 1 1 0 0 1 1 0 0 1 1 1 0 0 1 0 1 1 1 0 0 0 1 0 0 1 0 1 1 1 1 1 0 0 0 1 0 0 0 1 1 0 0 1 0 0 0 1 1 0 1 1 1 1 1 0 0 0 0 1 0 1 1 1 0 0 0 0 0 0 0 1 0 1 1 1 1 0 1 1 1 0 0 0 0 1 0 0 0 1 0 1 0 1 1 1 1 0 1 0 1 1 1 0 1 0 0 0 0 0 1 0 1 0 0 0 0 0 1 0 1 0 0 0 1 1 0 1 0 0 1 0 0 1 0 1 1 1 1 0 0 0 1 1 1 0 1 1 0 0 0 0 1 1 0 1 1 0 1 1 0 0 1 1 1 0 0 1 1 0 1 1 1 0 0 1 1 1 1 0 0 1 1 0 0 1 1 0 0 0 0 1 1 1 0 0 0 0 1 0 1 0 1 0 1 1 1 0 0 0 0 1 1 1 1 1 0 1 0 1 1 1 1 0 1 0 0 0 0 0 1 0 1 0 1 0 1 0 1 1 1

 */