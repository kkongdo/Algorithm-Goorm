package 놀이공원;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[][] garbages = new int[N][N];
			int answer = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					garbages[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int r = 0; r < N - K + 1; r++) {
				for (int c = 0; c < N - K + 1; c++) {
					int count = 0;
					for (int i = r; i < r + K; i++) {
						for (int j = c; j < c + K; j++) {
							count += garbages[i][j];
						}
					}
					answer = Math.min(count, answer);
				}
			}
			System.out.println(answer);
		}
	}
}
