package 뱀이지나간자리;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] nums = new char[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				nums[i][j] = '.';
			}
		}

		boolean flag = true;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				if (flag == true) {
					for (int j = 0; j < M; j++) {
						nums[i][j] = '#';
					}
					flag = false;
					continue;
				}

				if (flag == false) {
					for (int j = M - 1; j >= 0; j--) {
						nums[i][j] = '#';
					}
					flag = true;
				}
			}
			if (i % 2 == 1) {
				if (i < N) {
					if (flag == true) {
						nums[i][0] = '#';
					}
					if (flag == false) {
						nums[i][M - 1] = '#';
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(nums[i][j]);
			}
			System.out.println();
		}
	}
}
