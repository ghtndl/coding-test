package codingtest.datastructure.arr;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i =0; i<N; i++){
            if(A[i]>max) max = A[i];
            sum += A[i];
        }
        System.out.println(sum*100.0/max/N);
    }
}
// 이것도 가능
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    double[] arr = new double[n];
//    for (int i = 0; i < n; i++) {
//        arr[i] = sc.nextInt();
//    }
//    Arrays.sort(arr);
//    for(int i = 0; i < n; i++){
//        arr[i] = arr[i]/arr[n-1]*100;
//    }
//    double sum = 0;
//    for (int i = 0; i < n; i++) {
//        sum += arr[i];
//    }
//    System.out.println(sum/n);
//}