package 완벽한만들기;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int[] flavors = new int[input];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0; i < flavors.length; i++){
			flavors[i] = Integer.parseInt(st.nextToken());
			if(max < flavors[i]){
				max = flavors[i];
				index = i;
			}
		}
		int sum = 0;
		boolean flag = true;
		
		// 아래 탐색
		for(int i = index; i > 0; i--){
			if(flavors[i] < flavors[i - 1]){
				flag = false;
				break;
			}
		}
		
		// 위로 탐색
		for(int i = index; i < input - 1; i++){
			if(flavors[i] < flavors[i + 1]){
				flag = false;
				break;
			}
		}
		
		if(flag){
			for(int i = 0; i < flavors.length; i++){
				sum += flavors[i];
			}
		} else{
			sum = 0;
		}
		System.out.println(sum);	
	}
}