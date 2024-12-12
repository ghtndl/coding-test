package codingtest.swea;

import java.util.Scanner;

public class D3P2806 {
    static int arr[];
    static int max,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {

            n = sc.nextInt();
            arr = new int[n];
            max = 0;
            nQueen(0);
            System.out.println("#"+tc+" "+max);
        }
    }
    static void nQueen(int idx) {
        if(idx == n) {
            max++;
            return;
        }
        for(int i = 0; i < n; i++) {
            arr[idx] = i;

            if(isPossible(idx)){
                nQueen(idx+1);
            }
        }
    }

    private static boolean isPossible(int col) {
        for(int i = 0; i <col; i++){
            if(arr[col] == arr[i]){
                return false;
            }
            if(Math.abs(i - col) == Math.abs(arr[i] - arr[col])){
                return false;
            }
        }
        return true;
    }
}
