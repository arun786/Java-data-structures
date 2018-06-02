package algorithms;

/**
 * Created by Adwiti on 6/1/2018.
 */
public class InsertionSort {

    public static void main(String[] args) {
        Integer[] a = {5,2,4,6,1,3};
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
            /**
             * another variable to iterate the left side of the key
             */
            int j = i - 1;
            /**
             * condition should be j should be greater than 0
             * and values to the left side if greater than the key
             */
            while (j >= 0 && a[j] > key) {
                /**
                 * move the element 1 index above if the value is greater
                 * than the key.
                 */
                a[j + 1] = a[j];
                /**
                 * reduce the index by 1.
                 */
                j--;
            }
            a[j + 1] = key;
        }
        return a;
    }
}
