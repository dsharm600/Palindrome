/**********************************************
 * Author: Dhiraj Sharma
 * Class: CSE 360
 * Assignment 1
 * Description: This class implements a method isPalindrome that returns true if a input string is a Palindrome and false otherwise.
 */
package assign1;

/**
 * Class to determine palindrome
 */
public class Palindrome {
    /**
     * String to test
     */
    private String testString;

    /**
     * Constructor
     * @param s a string to test
     */
    public Palindrome(String s) {
        testString = s;
    }

    /**
     * Checks if a testString is palindrome
     * @return true is testString is palindrome
     */
    public boolean isPalindrome() {
        if (testString.isEmpty()) { // empty string is palindrome
            return true;
        }

        int front = 0; // index of the beginning of the substring being compared
        int back = testString.length() - 1; // index of the end of the substring being compared
        boolean isPalindrome = true; // flag indicating stop of processing

        while (front < back && isPalindrome) { // conditions for continuing processing
            // since we can use only one loop, we will only skip one insignificant character
            // in one iteration of the loop, either front or back.
            if (!Character.isLetterOrDigit(testString.charAt(front))) { // check if front character is significant or not
                ++front; // skip insignificant character from the front
            } else if (!Character.isLetterOrDigit(testString.charAt(back))) { // check if back character is significant or not
                --back; // skip insignificant character from the back
            } else { // both characters are significant
                char a = Character.toLowerCase(testString.charAt(front++)); // get lowercase character and increase front index
                char z = Character.toLowerCase(testString.charAt(back--)); // get lowercase character and decrease back index
                // compare significant characters from front and back
                isPalindrome = (a == z);
            }
        }
        // return result
        return isPalindrome;
    }
}

