package handcoding.stringP;

import java.util.Arrays;

public class StringDuplicatedRemove {
    public static void main(String[] args) {
        String[] arr = { "p", "e", "o", "p", "l" ,"e" };

        arr= Arrays.stream(arr).distinct().toArray(String[]::new);


        System.out.println(Arrays.toString(arr));


    }
    }