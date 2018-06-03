package algorithms;

/**
 * Created by Adwiti on 6/1/2018.
 */
public class InsertionSort {

    public static void main(String[] args) {
        Integer[] a = {5, 2, 4, 6, 1, 3};
        Integer[] b = insertionSort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static Integer[] insertionSort(Integer[] a) {
        /**
         *
         */
        for (int i = 1; i < a.length; i++) {
            /**
             * assign the second element as key
             */
            int key = a[i];
            System.out.println("i = " + i + " and Key = " + key);
            /**
             * another variable to iterate the left side of the key
             */
            int j = i - 1;
            /**
             * condition should be j should be greater than 0
             * and values to the left side if greater than the key
             */
            System.out.println("j = " + j + " element " + a[j]);
            System.out.println("Compare if j is greater than 0 and a at index " + j + " value = " + a[j] + " is greater than or less than key " + key);
            while (j >= 0 && a[j] > key) {
                /**
                 * move the element 1 index above if the value is greater
                 * than the key.
                 */
                System.out.println("------------------");
                System.out.println("    Condition satisfies so a[" + (j + 1) + "] " + a[j + 1] + " is swapped by a[" + j + "] " + a[j]);
                a[j + 1] = a[j];
                System.out.println("    After swapping a[" + (j + 1) + "] " + a[j + 1] + " and a[" + j + "] " + a[j]);
                /**
                 * reduce the index by 1.
                 */
                j--;
                System.out.println("    index j reduced " + j);
                System.out.println("------------------");
            }
            System.out.println("Once while loop condition is not satisfied...");
            System.out.println("key assigned to a[" + (j + 1) + "] " + a[j + 1]);
            a[j + 1] = key;
            System.out.println("===========================");
        }
        return a;
    }
}
