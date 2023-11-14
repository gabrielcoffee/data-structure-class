// UTILIZANDO O ÚLTIMO ELEMENTO COMO PIVÔ (PIVOT)

import java.util.Arrays;

public class QuickSort {

    private static int step = 1;

    static void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        print(nums);
    }

    public static void sort(int[] nums, int start, int end)
    {
        // Apenas executa a função se houver mais que um elemento na partição
        if (start < end) {

            int middle = partition(nums, start, end);

            sort(nums, start, middle - 1);
            sort(nums, middle + 1, end);
        }
    }

    public static int partition(int[] nums, int start, int end)
    {
        int pivot = nums[end];
        int marker = (start - 1);

        for (int i = start; i <= end; i++) {
            
            if (nums[i] <= pivot) {
                
                marker++;
                swap(nums, marker, i);
            }
        }

        return marker;
    }

    private static void print(int[] nums) {
        System.out.println(step + "  ->  " + Arrays.toString(nums));
        step++;
    }
}
