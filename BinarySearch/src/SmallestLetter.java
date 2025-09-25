public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd'};
        char target = 'e';

        System.out.println("The smallest letter of " + target + " is " + SmallestLetter(letters, target));

    }
    public static char SmallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;


        if (target > letters[end]) {
            return letters[0];

        }

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }
}
