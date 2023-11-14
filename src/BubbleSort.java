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

    public static int[] sort(int[] nums) {
        int step = 1;
        int swaps = -1;

        while (swaps != 0) {
            swaps = 0;

            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] > nums[i+1])
                {
                    swap(nums, i, i+1);

                    if (swaps == -1)
                        swaps = 1;
                    else
                        swaps++;

                    print(nums); // print da classe
                }
            }
        }

        return nums;
    }

    private static void print(int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
        step++;
    }
}
