import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[] {7, 2, 5, 1, 3, 8, 7, 4, 9, 6};

        Sort sort = new Sort();
        sort.quickSortRecursive(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }
}