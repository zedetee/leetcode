/* LeetCode 412. Fizz Buzz
 * Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:
n = 15,
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
 */
import java.awt.List;
import java.util.ArrayList;

public class L412_FizzBuzz {
	List<String> fb = new ArrayList<String>(n);
		
		for (int i=1; i<=n; i++) {
			String element = Integer.toString(i);
			if(i%3 == 0 && i%5 == 0) {element = "FizzBuzz";}
			else if (i%3 == 0) {element = "Fizz";}
			else if (i%5 == 0){element = "Buzz";}
			fb.add(element);	
			
		}
		return fb;
    }
}