package 이진수정렬;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Integer> nums = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(nums, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				int binaryCount1 = Integer.bitCount(o1);
				int binaryCount2 = Integer.bitCount(o2);
				if(binaryCount1 == binaryCount2){
					return o2 - o1;	
				} else{
					return binaryCount2 - binaryCount1;
				}
			}
		});
		
		System.out.println(nums.get(K - 1));
	}
}