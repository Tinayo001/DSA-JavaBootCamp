public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First index: " + result[0] + ", Last index: " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = findIndex(nums, target, true);  // first index
        ans[1] = findIndex(nums, target, false); // last index

        return ans;
    }

    private static int findIndex(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findFirst) {
                    end = mid - 1; // look left for first occurrence
                } else {
                    start = mid + 1; // look right for last occurrence
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
