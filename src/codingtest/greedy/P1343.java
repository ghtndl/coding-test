package codingtest.greedy;

import java.io.*;
import java.util.Scanner;

public class P1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i = 0; i < board.length(); i++) {
            if(board.charAt(i) == 'X') {
                count++;
            } else {
                if(count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                while(count >= 4) {
                    sb.append("AAAA");
                    count -= 4;
                }
                while(count >= 2) {
                    sb.append("BB");
                    count -= 2;
                }
                sb.append('.');
                count = 0;
            }
        }

        if(count % 2 != 0) {
            System.out.println(-1);
            return;
        }
        while(count >= 4) {
            sb.append("AAAA");
            count -= 4;
        }
        while(count >= 2) {
            sb.append("BB");
            count -= 2;
        }

        System.out.println(sb.toString());
    }
}
/**
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String a4 = "AAAA";
        String b2 = "BB";

        String answer = "";
        str = str.replaceAll("XXXX",a4);
        answer = str.replaceAll("XX",b2);

        if(answer.contains("X")){
            System.out.println("-1");
        } else {
            System.out.println(answer);
        }
    }
 }
 */
