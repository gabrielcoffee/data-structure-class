import java.util.Arrays;

public class InsertionSort {

    public static int[] sort(int[] nums) {

        int step = 1;

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > cur) {
                nums[j+1] = nums[j];
                j--;

                print(step, nums);
                step++;
            }

            nums[j + 1] = cur;

            print(step, nums);
            step++;
        }

        return nums;
    }

    private static void print(int step, int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
    }

}
