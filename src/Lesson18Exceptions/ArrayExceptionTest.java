package Lesson18Exceptions;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int arr [] = {7, 12, 8, 4, 33, 79, 1, 16, 2};

        printArray(arr, 0, 6);
        printArray(arr, -1, 4);
        printArray(arr, 0, 10);
        printArray(arr, 1, 9);

    }

    static void printArray(int[] array, int start, int end){
        int count = 0;
        try {
            for (int i = start; i < end; i++) {
                count = i;
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(String.format("«Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = %d; размер массива = %d;", count, array.length));
        }
    }
}
