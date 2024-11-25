package 구름이의취미;

import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long MOD = 1000000007;

        long sum = N * (N + 1) / 2 % MOD;

        long result = sum * sum % MOD;

        System.out.println(result);
    }
}
