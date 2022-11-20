public class Main {
    public static void main(String[] args) {

        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Search search = new Search();
        int resultIndex = search.binarySearchRecursive(nums, 0, nums.length - 1, 6);

        Sort sort = new Sort();
        sort.descendingBubbleSort(nums);

        for (int s : nums) {
            System.out.print(s + ", ");
        }

        System.out.println();

        sort.insertSort(nums);

        for (int s : nums) {
            System.out.print(s + ", ");
        }
    }
}