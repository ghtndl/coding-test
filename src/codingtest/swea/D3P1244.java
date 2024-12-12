package codingtest.swea;

import java.util.Scanner;

public class D3P1244 {
    static String[] arr;
    static int chance;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {
            sc.nextLine(); // 개행 소비
            arr = sc.next().split("");
            chance = sc.nextInt();
            max = 0;
            dfs(0, 0);
            System.out.println("#" + tc + " " + max);
        }
    }

    private static void dfs(int start, int count) {
        if(count == chance) {
            String result = "";
            for(String s : arr) {
                result += s;
            }
            max = Math.max(max, Integer.parseInt(result));
            return;
        }

        for(int i = start; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                swap(i, j);
                dfs(i, count + 1); // start를 i로 업데이트
                swap(i, j);
            }
        }
    }

    private static void swap(int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}