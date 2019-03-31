/**
 * 
 */

/**
 * @author vivekgupta
 *
 */

import java.io.*;
import java.util.*;

public class BalancedBrackets {

	// Complete the isBalanced function below.
	static String isBalanced(String s) {
		char[] EachBracket = s.toCharArray();
		ArrayList<Character> LIFO = new ArrayList<Character>();
		int sizeOfStack = 0;
		String Flag = "NO";
		for(char b : EachBracket){
			System.out.println(LIFO);
			if(LIFO.isEmpty() && (b =='}' || b == ']' || b == ')')){
				Flag = "NO";
				LIFO.add(b);
				break;
			}

			if(b =='{' || b == '[' || b == '('){
				LIFO.add(new Character(b));
				sizeOfStack++;
			} 
			if((b == '}' && LIFO.get(sizeOfStack-1) != '{') || (b == ']' &&  LIFO.get(sizeOfStack-1) != '[')|| (b == ')' && LIFO.get(sizeOfStack-1) != '(')){
				Flag = "NO";
				break;
			} 
			if((b == '}' && LIFO.get(sizeOfStack-1) == '{') || (b == ']' &&  LIFO.get(sizeOfStack-1) == '[')|| (b == ')' && LIFO.get(sizeOfStack-1) == '(')){
				LIFO.remove(sizeOfStack-1);
				sizeOfStack--;
			} 

		}
		if(LIFO.isEmpty()){
			Flag = "YES";
		}
		return Flag;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String s = scanner.nextLine();

			String result = isBalanced(s);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
