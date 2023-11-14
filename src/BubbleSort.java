import java.util.Arrays;

public class BubbleSort {

    private static int step = 1;

    private static void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        print(nums);
    }

    // função da ordenação
    public static int[] sort(int[] nums) {
        int swaps = -1;
        int end = nums.length-1;

        while (swaps != 0) {
            swaps = 0;

            // Passar por todos elementos
            for (int i = 0; i < end; i++) {

                if (nums[i] > nums[i+1])
                {
                    swap(nums, i, i+1);
                    swaps++;
                }
            }

            end--;
        }

        return nums;
    }

    private static void print(int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
        step++;
    }
}
