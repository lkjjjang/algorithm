public class Sort {
    public void ascendingBubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public void descendingBubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int temp = findMinIndex(nums, i);
            swap(nums, i, temp);
        }
    }

    public void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;

            while (true) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;

                    if (j == 1) {
                        break;
                    }

                    j--;
                } else {
                    break;
                }
            }
        }
    }

    private int findMinIndex(int[] nums, int index) {
        int result = index;
        int temp = nums[index];
        for (int i = index + 1; i < nums.length; i++) {
            if (temp > nums[i]) {
                temp = nums[i];
                result = i;
            }
        }

        return result;
    }

    private void swap(int[] nums, int front, int back) {
        int temp = nums[front];
        nums[front] = nums[back];
        nums[back] = temp;
    }
}
