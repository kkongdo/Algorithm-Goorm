package 헷갈리는작대기;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] ch = {'1', 'I', 'l', '|'};
		int[] result = new int[4];
		
		for(int i = 0; i < ch.length; i++){
			for(int j = 0; j < str.length(); j++){
				if(ch[i] == str.charAt(j)){
					result[i]++;	
				}	
			}
		}
		
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
}
