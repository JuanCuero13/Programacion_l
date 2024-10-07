public class Ejerciciotrue {

   
    public static void main(String[] args) {
        
        boolean a, b, c;
        a = b = c =true;
        if (!a && (b && c)) {
            System.out.println("Sentencia if Ejecutada");
            
        } else{
            System.out.println("Sentencia else Ejecutada");
        }
    }
    
}

//**********
public class EjercicioMatematico {

  
    public static void main(String[] args) {
        int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;

        if (a < b) {
            System.out.println("A is less than B");
        }
        if (a == b) {
            System.out.println("A is equal to B");
        }
        if (a > b) {
            System.out.println("A is greater than B");
        }

    }
}

//*************
public class EjercicioFalsoVerdadero {

  
    public static void main(String[] args) {
        if (true && false && true || false)
            System.out.println("True");
        else
            System.out.println("False");
        

    }
}