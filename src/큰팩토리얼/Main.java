package 큰팩토리얼;

import java.io.*;
class Main {
    static int modNum = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % modNum;
        }
        return (int) result;
    }
}
