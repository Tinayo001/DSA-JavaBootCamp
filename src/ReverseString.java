public class ReverseString {
    public static void main(String[] args) {
        String name = "Tinayo";

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println("The reversed version of this string " + name + " is " + reversed);

    }

}
