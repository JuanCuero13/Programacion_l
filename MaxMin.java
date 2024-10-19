import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I;
        double MAX, MIN, NUMERO;

        System.out.println("NUMERO: ");
        NUMERO = scanner.nextDouble();
        MAX = NUMERO;
        MIN = NUMERO;

        for (I = 2; I <= 100; I++) {
            System.out.println("NUMERO: ");
            NUMERO = scanner.nextDouble();

            if (NUMERO > MAX) {
                MAX = NUMERO;
            } else if (NUMERO < MIN) {
                MIN = NUMERO;
            }
        }

        System.out.println("Máximo: " + MAX + ", Mínimo: " + MIN);

        
    }
}

