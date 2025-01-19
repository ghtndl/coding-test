package handcoding;

public class Lottery {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*45)+1;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
