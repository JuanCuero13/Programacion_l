import java.util.Scanner;

public class MediaParejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1;
        int N2;
        double M, MAX;

        System.out.println("Ingrese N1: ");

        N1 = scanner.nextInt();

        System.out.println("Ingrese N2: ");
        N2 = scanner.nextInt();

        MAX = (N1 + N2) / 2.0;

        while (N1 != 999 && N2 != 999) {
            
            System.out.println("Ingrese N1: ");
            N1 = scanner.nextInt();

            System.out.println("Ingrese N2: ");
            N2 = scanner.nextInt();

            M = (N1 + N2) / 2.0;
        
            if (M > MAX) {
                MAX = M;
            }
        }
   
        System.out.println("Media máxima = " + MAX);
           
    }
}
