public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int rem  = number;
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        if (rem == rev) {
            System.out.println(rem  + " is a palindrome.");
        } else {
            System.out.println(rem + " is not a palindrome.");
        }
    }
}