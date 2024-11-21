package 운동중독플레이어;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
	
		double result = W * (1 + R / 30D);
		
		System.out.println((int)result);
	}
}
