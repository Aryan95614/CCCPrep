import java.util.Scanner;
import java.util.Vector;

class Main {
    public static int findMinValue(Vector<Integer> vector) {
        if (vector.isEmpty()) {
            throw new IllegalArgumentException("Vector is empty.");
        }

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

        if(starting < vector1.size()) {
            Vector<Integer> temp = new Vector<Integer>();
            for(int i = 0; i < size; i++) {
                temp.add(vector1.get(i+starting));
            }
            return temp;
        }
        return vector1;
    }

    public static int getLimit(int number, int limit) {

        return limit-number+1;
    }
    public static int asymmetric(Vector<Integer> subset) {
        int value = 0;
        int size = (int)subset.size();
        if (size == 1) {
            return 0;
        }

        if (size % 2 == 1) {

            for(int i = 0; i < (size-1)/2;i++ ) {

                value += Math.abs(subset.get(i) - subset.get(size-i-1));        }

            return value;
        } else {
            for(int i = 0; i < size/2;i++ ) {

                value += Math.abs(subset.get(i) - subset.get(size-i-1));      }

            return value;
        }
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

        for (int sizes = 2; sizes < numMountains; sizes++) {
            Vector<Integer> temp1 = new Vector<Integer>();
            for (int startings = 0; startings < getLimit(sizes, numMountains); startings += 1) {
                int element = 0;
                Vector<Integer> temp = subsize(heights, sizes, startings);
                temp1.add(asymmetric(temp));
            }
            outputs.add(findMinValue(temp1));
        }

        outputs.add(asymmetric(heights));

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