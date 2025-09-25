public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        int target = 130;

        System.out.println(ans(array, target));
    }

    public static int ans(int[] array, int target) {
        // first find the range
        int start = 0;
        int end = 1;

        // expand range until target is within it
        while (target > array[end]) {
            int newStart = end + 1;
            // double the size of the box
            end = end + (end - start + 1) * 2;
            start = newStart;

            // safeguard (in real infinite array problem this isn't needed,
            // but here our array is finite)
            if (end >= array.length) {
                end = array.length - 1;
                break;
            }
        }

        return BinarySearch(array, target, start, end);
    }

    public static int BinarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // target not found
    }
}

