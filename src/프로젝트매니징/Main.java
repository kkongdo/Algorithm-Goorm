package 프로젝트매니징;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		while(N-- > 0){
			int c1 = Integer.parseInt(br.readLine());
			M = M + c1;
			while (M >= 60){
				T++;
				M = M - 60;
			}
			if(T >= 24){
				T -= 24;
			}
		}
		System.out.println(T +" " + M);
	}
}
