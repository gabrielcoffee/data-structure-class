import java.util.Arrays;

public class QuickSort {

    static int step = 1;

    private static int[] sortRecursive(int start, int end, int[] nums) {
        int marker = 0;
        int pivot = nums[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= pivot) {
                marker++;
            }

            if (marker < i) {
                int tmp = nums[i];
                nums[i] = nums[marker];
                nums[marker] = tmp;

                print(step, nums);
                step++;
            }
        }

        sortRecursive(0, marker, nums);
        sortRecursive(marker+1, nums.length, nums);

        return nums;
    }

    public static int[] sort(int[] nums) {
        int[] result = sortRecursive(0, nums.length, nums);
        step = 1;
        return result;
    }

    private static void print(int step, int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
    }
}
