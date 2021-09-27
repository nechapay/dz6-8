import java.util.Arrays;

public class Main {

    /*
        Напишите группу методов, которые будут находить в массиве чисел наименьшее и наибольшее число,
        среднее всех чисел и медианное число (такое, что половина чисел меньше него, а половина - больше или равна).
     */

    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[]{1, 21, 15, 4, 36, 8, 72, 46, 9, 13, 2};
        System.out.println("Найменьший элемент массива: " + arrayMin(arr) + " " + Arrays.toString(arr));
        System.out.println("Найбольший элемент массива: " + arrayMax(arr) + " " + Arrays.toString(arr));
        System.out.println("Среднее арифметическое всех чисел массива: " + arrayAverage(arr) + " " + Arrays.toString(arr));
        System.out.println("Медианное число массива: " + arrayMedian(arr) + " " + Arrays.toString(arr));
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j) min = j;
        }
        return min;
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) max = j;
        }
        return max;
    }

    public static float arrayAverage(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    public static float arrayMedian(int[] arr) {
        int mid;
        Arrays.sort(arr);
        if(arr.length % 2 == 0) {
            mid = (arr[arr.length / 2  - 1] / 2)  + (arr[arr.length / 2  + 1] / 2);
        } else {
            mid = arr[arr.length / 2];
        }
        return mid;
    }
}
