import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] nums) {
        int step = 1;
        int swaps = -1;

        while (swaps != 0) {
            swaps = 0;

            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] > nums[i+1])
                {
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;

                    if (swaps == -1)
                        swaps = 1;
                    else
                        swaps++;

                    print(step, nums); // print da classe
                    step++;
                }
            }
        }

        return nums;
    }

    private static void print(int step, int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
    }
}
