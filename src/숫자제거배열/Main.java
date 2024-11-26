package 숫자제거배열;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String K = st.nextToken();
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			String str = st.nextToken();
			if(!str.contains(K)){
				count++;
			}
		}
		
		System.out.println(count);
	}
}