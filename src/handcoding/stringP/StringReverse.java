package handcoding.stringP;

/** 문자열 뒤집기 */

public class StringReverse {
    public static void main(String[] args) {
        String str = "abcd";

        /** 답안 1 */
        char[] chars = str.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

        System.out.println();

        /** 답안 2 */
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
