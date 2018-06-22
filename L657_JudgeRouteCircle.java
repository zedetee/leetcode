/* Leetcode 657. Judge Route Circle
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle. 
 */
public class L657_JudgeRouteCircle {
	public static boolean judgeCircle(String moves) {
		int x=0, y=0;
		for (int i=0; i<moves.length(); i++) {
			char temp = moves.charAt(i);
			if (temp == 'R') { 
				x++; 
			} else if (temp == 'L') { 
				x--; 
			} else if (temp == 'U') {
				y++;
			} else if (temp == 'D') {
				y--;
			}
		}
		if(x==0 && y==0) {
			return true; 
		} else { 
			return false;
		}
	}
	

	public static void main(String[] args) {
		String moves = "LL";
		boolean isCircle = judgeCircle(moves);
		System.out.println(isCircle);

	}

}
