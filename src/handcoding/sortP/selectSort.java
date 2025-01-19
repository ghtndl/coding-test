package handcoding.sortP;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {10,30,40,20,70,100,60};

        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
