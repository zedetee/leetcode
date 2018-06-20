//Leetcode 852
/*
Let's call an array A a mountain if the following properties hold:

    A.length >= 3
    There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]

Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1

Example 2:

Input: [0,2,1,0]
Output: 1

Note:

    3 <= A.length <= 10000
    0 <= A[i] <= 10^6
    A is a mountain, as defined above.

 */
public class PeakIndex852 {

	public static int peakIndexInMountainArray(int[] A) {
        boolean peakFound = false;
        int start = 0;
        int end = A.length - 1;
        int middle = (start + end)/2;
        
        while (peakFound == false)
        {
        	middle = (start + end)/2;
        	if (A[middle] > A[middle - 1] && A[middle] > A[middle + 1]) {
        		peakFound = true;
        		return middle;        		
        	} else if (A[middle] > A[middle - 1] && A[middle] < A[middle + 1] ) {
        		start = middle;
        	} else if (A[middle] < A[middle - 1] && A[middle] > A[middle + 1] ) {
        		end = middle;
        	}
        }
		return middle;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {24,69,100,99,79,78,67,36,26,19};
		int answer = peakIndexInMountainArray(myArray);
		System.out.println(answer);
	}

}
