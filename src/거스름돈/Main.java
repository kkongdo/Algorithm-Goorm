package 거스름돈;

import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] coins = {40, 20, 10, 5, 1};
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int coin : coins){
			count += Math.floor(N / coin);
			N %= coin;
		}
		System.out.println(count);
	}
}