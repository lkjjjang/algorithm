public class Search {
    public int binarySearchRecursive(int[] nums, int left, int right, int value) {
        if (left > right) {
            System.out.println("not found");
            return -1;
        }

        int mid = (left + right) / 2;

        if (nums[mid] == value) {
            System.out.println("result index : " + mid);
            return mid;
        }

        System.out.print("mid : " + mid);
        if (nums[mid] > value) {
            int r = mid - 1;
            System.out.println(" left : 0" + " right : " + r);
            return binarySearchRecursive(nums, 0, r, value);
        } else {
            int l = mid + 1;
            System.out.println(" left : " + l + " right : " + right);
            return binarySearchRecursive(nums, l, right, value);
        }
    }
}
