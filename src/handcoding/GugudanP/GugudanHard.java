package handcoding.GugudanP;

public class GugudanHard {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if(i==3) {
                    if(j%3!=0)
                        System.out.println(i+"*"+j+"="+String.format("%2d", i*j));
                }
            }
        }
    }
}
