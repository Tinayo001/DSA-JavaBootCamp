public class Floor {
    public static void main(String[] args) {
        int[] nums = {12, 15, 17, 19, 24, 29};

        int target1 = 16;
        System.out.println("Floor of " + target1 + " is: " + getFloor(nums, target1));

        int target2 = 25;
        System.out.println("Floor of " + target2 + " is: " + getFloor(nums, target2));

        int target3 = 32;
        System.out.println("Floor of " + target3 + " is: " + getFloor(nums, target3));

    }
    public static int getFloor(int[] nums, int targetFloor) {


        int start = 0;
        int end = nums.length - 1;

        if (targetFloor < nums[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (targetFloor == mid) {
                return nums[mid];
            } else if (targetFloor < nums[mid]) {
                end = mid - 1;
            } else if (targetFloor > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return nums[end];
    }

}
