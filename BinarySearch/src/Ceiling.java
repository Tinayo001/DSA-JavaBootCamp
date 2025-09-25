public class Ceiling {
    public static void main(String[] args) {
        int [] nums = {23, 25, 29, 32, 35, 37, 40};
        int target = 30;

        System.out.println(target + "its ceiling is " + Ceiling(nums, target));

        int target2 = 39;
        System.out.println(target2 + "Its ceiling is " + Ceiling(nums, target2));

    }
    public static int Ceiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (target > nums[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
