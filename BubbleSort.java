import java.util.Arrays;

public class BubbleSort {

    int[] nums;

    public BubbleSort(int[] nums) {
        this.nums = nums;
    }

    public int[] bubbleSorting(int[] nums) {
    
        for (int i = nums.length - 1; i >= 1; i--) {
            System.out.println("next circle");
            for (int b = 0; b < i; b++) {
                if (nums[b] > nums[b + 1]) {
                    int temp = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = temp;
                }
                System.out.println(Arrays.toString(nums));
            }
        }
        System.out.println("" + Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
    
    }
}
