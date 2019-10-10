/**********************************************
 * Author: Dhiraj Sharma
 * Class: CSE 360
 * Assignment 1
 * Description: This class implements a test method for palindrome class which checks various aspects of the class
 * such as punctuation, numbers, and uppercase and lowercase letters.
 */
package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test 
	// This test case tests if lowercase letters for palindrome return true  
	public void test1() {
		Palindrome string = new Palindrome("aba");
		assertTrue(string.isPalindrome(),"Your test case fails to read lowercase letters");
	}
	
	@Test 
	// This test case tests if uppercase letters for palindrome return true  
	public void test2() {
		Palindrome string = new Palindrome("ABA");
		assertTrue(string.isPalindrome(),"Your test case fails to read uppercase letters");
	}
	
	@Test 
	// This test case tests if palindrome's with number return true  
	public void test3() {
		Palindrome string = new Palindrome("A2A");
		assertTrue(string.isPalindrome(),"Your test case fails to read numbers for palindrome");
	}
	
	@Test 
	// This test case tests if non-palindrome return false  
	public void test4() {
		Palindrome string = new Palindrome("abb");
		assertFalse(string.isPalindrome());
	}
	
	@Test 
	// This test case tests if punctuated palindrome return true  
	public void test5() {
		Palindrome string = new Palindrome(". a");
		assertTrue(string.isPalindrome(),"Your method is not ignoring punctuation");
	}
	
	@Test 
	// This test case tests if isPalindrome method ignores whitespace and return true for palindrome  
	public void test6() {
		Palindrome string = new Palindrome(" a ");
		assertTrue(string.isPalindrome(),"Your method is not ignoring whitespace.");
	}
	
	@Test 
	// This test case tests if non-palindrome with puncutation return false  
	public void test7() {
		Palindrome string = new Palindrome("abb = /");
		assertFalse(string.isPalindrome());
	}
	
	@Test 
	// This test case tests if non-palindrome with whitespace return false  
	public void test8() {
		Palindrome string = new Palindrome("abb a b");
		assertFalse(string.isPalindrome());
	}
}

