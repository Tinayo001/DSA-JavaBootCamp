public class Palindrome {
    public static void main(String[] args) {
        String s1 = "Cristiano";

        if (isPalindrome(s1)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}

