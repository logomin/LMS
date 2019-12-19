package Lesson5Arrays;

import java.util.Arrays;
import java.util.Random;

public class Lab5Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // TODO init it's array by new with size 4.

        firstArray[0] = 2.3f;
        firstArray[(firstArray.length - 1)] = 5.8f;  // TODO insert some value to start of array and to end of array.

        int[] intArray = {2, 8, 45, 2, -2, 0, 258}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length); // TODO copy "intArray". Use copyOf...

        // 1.3)
        Arrays.sort(intArrayCopy); // TODO sort "intArrayCopy", use Arrays sort.

        System.out.println(Arrays.toString(intArrayCopy)); // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.

        if (Arrays.equals(intArray, intArrayCopy)) {
            System.out.println("Arrays equals");
        } else {
            System.out.println("Arrays not equals");
        }// 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        int result = 0;
        for (int value : testArray) {
            result += value;
        }
        System.out.println("sum of all array elements = " + result);// TODO calc sum of all array elements and print result.

        result = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (i % 2 == 0) result += testArray[i];
        }
        System.out.println("sum of all numbers with odd indexes = " + result);
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.

        // 2.3)
        Arrays.sort(testArray);
        System.out.println("max value in array is " + testArray[testArray.length - 1]);
        // TODO find max value in array.


        // PART 3

        //3.1
        Random random = new Random();
        int[][] twoDimArray = new int[3][4]; // TODO create two-dimensional array with size [3][4]
        for (int[] row : twoDimArray) {
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt(100);
            }
        }

        //3.2

        for (int[] row : twoDimArray) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.print("\n");
        }  // TODO fill array with any numbers in cycles.

        //3.3

        long sum1 = 0;
        for (int[] row : twoDimArray) {
            for (int i = 0; i < row.length; i++) {
                sum1 += row[i];
            }
        }
        System.out.println("sum of all array elements is " + sum1);


        // TODO calc sum of all array elements and print result.


        // PART 4*

        System.out.println();


        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (
                long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }


        for (long[] row : matrix) {
            for (long value : row) {
                System.out.print(value + "\t");
            }
            System.out.print("\n");
        }  // TODO fill array with any numbers in cycles.


        long max_value = Long.MIN_VALUE, min_value = Long.MAX_VALUE;

        int sum = 0, count = 1;
        for (long[] row : matrix) {
            if (count > 2 && count <= 5) {
                for (int i = 0; i < row.length; i++) {
                    if ((i + 1) % 3 == 0) {
                        if (row[i] > max_value) max_value = row[i];
                        if (row[i] < min_value) min_value = row[i];
                    }
                }
            }
            count += 1;
        }

        System.out.println("max_value " + max_value);
        System.out.println("min_value " + min_value);

        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        long sum2 = max_value + min_value;
        System.out.println("sum only max and min values of matrix is " + sum2);
    }

}
