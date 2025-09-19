import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = BuildArray(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("ans  = " + Arrays.toString(ans));


    }
    public static int[]BuildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
