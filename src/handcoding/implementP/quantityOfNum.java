package handcoding.implementP;

public class quantityOfNum {
    public static void main(String[] args) {
        int answer=0;
        int[] array= {7,77,17};

        for(int i=0; i<array.length; i++) {
            String num = Integer.toString(array[i]);
            String[] arr = num.split("");

            for(int j=0; j<arr.length; j++) {
                if(arr[j].equals("7")) {
                    answer++;
                }
            }
        }

        int answer2 = 0;
        for(int num : array){
            String strNum = String.valueOf(num);
            answer2 += (int) strNum.chars().filter(c->c=='7').count();
        }

        System.out.println(answer);
        System.out.println(answer2);
    }
}
