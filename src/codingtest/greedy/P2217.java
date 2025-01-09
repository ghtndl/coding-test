package codingtest.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P2217 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] sorted = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
        int max = 0;
        for(int i=0;i<N;i++){
            int weight = sorted[i]*(i+1);
            if( weight > max){
                max = weight;
            }
        }
        System.out.println(max);
    }
}