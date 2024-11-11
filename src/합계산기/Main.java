package 합계산기;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int result = 0;
		
		for(int i = 0; i < num; i++){
			st = new StringTokenizer(br.readLine());
			int operand1 = Integer.parseInt(st.nextToken());
			String operator = st.nextToken();
			int operand2 = Integer.parseInt(st.nextToken());
			switch(operator){
				case "+":
						result += (operand1 + operand2);
					break;
				case "-":
						result += (operand1 - operand2);
					break;
				case "*":
						result += (operand1 * operand2);
					break;
				case "/":
						result += (operand1 / operand2);
					break;
			}
		}
		System.out.println(result);
	}
}
