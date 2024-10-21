import java.util.Scanner;

public class DeteccionError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SW = 0; 
        double N; 

        while (SW == 0) { 
            System.out.println("Ingrese un número: ");
            N = scanner.nextDouble(); 

           
            if (N != Math.floor(N)) { 
                System.out.println("Dato no valido");
                System.out.println("Ejecute nuevamente");
                SW = 1; 
            } else {
                System.out.println("Correcto, " + (int) N + " es entero");
            }
        }
       
    }
}
