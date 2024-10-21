import java.util.Scanner;

public class Comercio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Códigos de artículos
        int A = 22;
        int B = 45;
    
        int PA = 350;
        int PB = 120;
        
        
        int AE = 12;
        int BE = 7;

        
        System.out.print("Ingrese el código del artículo: ");
        int articulo = leer.nextInt();
        
      
        switch (articulo) {
            case 22:
                System.out.println("Código del artículo: " + A);
                System.out.println("Unidades existentes: " + AE);
                System.out.println("Importe total: $" + (PA * AE));
                break;
            case 45:
                System.out.println("Código del artículo: " + B);
                System.out.println("Unidades existentes: " + BE);
                System.out.println("Importe total: $" + (PB * BE));
                break;
            default:
                System.out.println("Error: Ingrese un código de artículo válido.");
                break;
        }
        
        
    }
}


