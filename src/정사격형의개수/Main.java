package 정사격형의개수;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		BigInteger result = BigInteger.ZERO;
		
    for (int i = 1; i <= num; i++) {
    	result = result.add(BigInteger.valueOf((long) i).multiply(BigInteger.valueOf((long) i)));
    }

		System.out.println(result);
	}
}