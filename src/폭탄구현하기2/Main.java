package 폭탄구현하기2;

import java.io.*;
import java.util.*;

class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		char[][] nums = new char[N][N];
		int[][] result = new int[N][N];
		
		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++){
				nums[i][j] = st.nextToken().charAt(0);
			}
		}
		
		for(int k = 0; k < K; k++){	
			st = new StringTokenizer(br.readLine());	
			
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y= Integer.parseInt(st.nextToken()) - 1;
			
			if(nums[x][y] == '@'){
				result[x][y] = result[x][y] + 2;
			}
			else if(nums[x][y] != '#'){
				result[x][y]++;
			}
			
			for(int i = 0; i < 4; i++){
				int cx = x + dx[i];
				int cy = y + dy[i];
				
				if(cx >= 0 && cx < N && cy >= 0 && cy < N){
					if(nums[cx][cy] == '@'){
						result[cx][cy] += 2;
					}
					else if(nums[cx][cy] != '#'){
						result[cx][cy]++;
					}
				}
			}
		}
		int maxNumber = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				maxNumber = Math.max(maxNumber, result[i][j]);
			}
		}
		System.out.println(maxNumber);
	}
}
