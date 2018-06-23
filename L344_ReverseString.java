/*
 * Leetcode 344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh". 
 */
public class L344_ReverseString {

	public static String reverseString(String s) {
		String reverse = "";
        for (int i=s.length()-1; i>=0; i--) {
        	reverse += s.valueOf(s.charAt(i));
        }
		return reverse;
    }

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(reverseString(s));
	}
}
