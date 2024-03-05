package arrayAndString;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 12345;  // Original number to be reversed
        int rev = 0;    // Variable to store the reversed number

        // Loop to reverse the digits of the number
        for (; n != 0;) {
            // Extract the last digit of the number
            int rem = n % 10;

            // Build the reversed number by multiplying the current reversed number by 10 and adding the extracted digit
            rev = rev * 10 + rem;

            // Remove the last digit from the original number
            n = n / 10;
        }

        // Print the reversed number
        System.out.println("Reversed number: " + rev);
	}

}
