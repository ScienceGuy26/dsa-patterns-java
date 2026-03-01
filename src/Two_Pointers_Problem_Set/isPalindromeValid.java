package Two_Pointers_Problem_Set;

public class isPalindromeValid {
    public static void main (String[] args){
        String val = "abc123";

        is_palindrome_valid(val);

    }

        public static void is_palindrome_valid(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                // Skip non-alphanumeric characters from the left.
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                // Skip non-alphanumeric characters from the right.
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }
                // If the characters at the left and right pointers don’t match, the string is
                // not a palindrome.
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                     System.out.println("The string is not palindrome!");
                }
                left++;
                right--;
            }

        }

        //This  program is with the return value Boolean type.
        /*
    public static boolean is_palindrome_valid(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // Skip non-alphanumeric characters from the left.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right.
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // If the characters at the left and right pointers don’t match, the string is
            // not a palindrome.
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
               return false;
            }
            left++;
            right--;
        }
    return true;
    }

         */

}
