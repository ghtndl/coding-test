package codingtest.datastructure.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();          //수열
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer sb = new StringBuffer();
        boolean result = true;

        for(int i = 0; i<arr.length; i++){
            int su = arr[i];                //수열
            if(su >= num){
                while(su>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
    if(result){
        System.out.println(sb.toString());
    }
    }
}
