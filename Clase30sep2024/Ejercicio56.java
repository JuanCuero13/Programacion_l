import java.util.Scanner;

public class Ejercicio56 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double nota = 0.0;
        int aprobados = 0, noAprobados = 0;
        //Notas de los estudiantes

        Scanner leer = new Scanner(System.in);
        System.out.print("Digitre la cantidad de estudiantes: ");
        int estudiantes = leer.nextInt();

        for(int i = 1; i <= estudiantes; i++){
            System.out.print("Nota del estudiante" + i + ": ");
            nota = leer.nextDouble();

            if (nota >= 5.0){
                aprobados++;
            }else{
                noAprobados++;   
            }
        }
    
       System.out.println("Aprobados: " + aprobados + " No Aprobados: " + noAprobados);
    }
}
