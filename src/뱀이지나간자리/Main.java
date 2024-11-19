import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] nums = new char[N][M];

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Arrays.fill(nums[i], '#');
            } else {
                Arrays.fill(nums[i], '.');
                if ((i / 2) % 2 == 0) {
                    nums[i][M - 1] = '#';
                } else {
                    nums[i][0] = '#';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(new String(nums[i]));
        }
    }
}