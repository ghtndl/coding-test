package handcoding.stringP;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aba";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversedStr));
        String rev = "";
        char[] a = str.toCharArray();
        for(int i = a.length - 1; i >= 0; i--) {
            rev += a[i];
        }

        System.out.println(str.equals(rev));
    }
}
