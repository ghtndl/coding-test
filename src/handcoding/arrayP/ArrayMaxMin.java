package handcoding.arrayP;

import java.util.Arrays;

/** 배열의 최대값 최소값 찾기 */
public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Version 1
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(max);
        System.out.println(min);

        //Version 2
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[0]);

        //Version3
        int maxnum = arr[0];
        int minnum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxnum < arr[i]) {
                maxnum = arr[i];
            }
            if(minnum > arr[i]) {
                minnum = arr[i];
            }
        }
        System.out.println(maxnum);
        System.out.println(minnum);
    }
}
