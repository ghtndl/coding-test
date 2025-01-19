package handcoding.GugudanP;

public class Gugudan {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(String.format("%2d",i) + " *" + String.format("%2d",j) + " = " + String.format("%2d", i * j) + " ");
            }
            System.out.println();
        }

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + " ");
            }
            System.out.println();
        }
    }
}
