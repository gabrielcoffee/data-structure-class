import java.util.Arrays;

public class InsertionSort {

    private static int step = 1;

    public static int[] sort(int[] nums) {

        step = 1;

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > cur) {
                nums[j+1] = nums[j];
                j--;

                print(nums);
            }

            nums[j + 1] = cur;

            print(nums);
        }

        return nums;
    }

    private static void print(int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
        step++;
    }

}
