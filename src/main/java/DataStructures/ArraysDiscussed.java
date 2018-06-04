package DataStructures;

/**
 * Created by Adwiti on 6/4/2018.
 */
public class ArraysDiscussed {
    /**
     * Arrays when defined should be fixed in size.
     * while arrays are good for random index which is of the order O(1)
     * <p>
     * Linear search is of the order O(N)
     */

    public static void main(String[] args) {
        /**
         * here we need to define the size of the array
         * which will be fixed and cannot be changed
         */
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        /**
         * Random Indexing is of Order O(1)
         */
        int numValue = nums[2];
        System.out.println(numValue);

//        output will be 2

        /**
         * But for linear search order is O(N)
         */

        /**
         * for example if we need to find the index of 4
         */

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                System.out.println("Index found " + i);
            }
        }

    }
}
