package 대소문자바꾸기;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] ch = str.toCharArray();
		
		for(int i = 0; i < num; i++){
			if(ch[i] >= 'A' && ch[i] <= 'Z'){
				ch[i] = (char)(ch[i] + 32);
			} else{
				ch[i] = (char)(ch[i] - 32);
			}
		}
		
		for(int i = 0; i < num; i++){
			System.out.print(ch[i]);
		}
	}
}