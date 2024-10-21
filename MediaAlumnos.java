import java.util.Scanner;

public class MediaAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nombreAlumno;
        double calificacionBASIC, calificacionPascal, calificacionFORTRAN, promedio;
        
        
        System.out.print("Ingrese el nombre del alumno (*** para finalizar): ");
        nombreAlumno = scanner.nextLine();
        
        while (!nombreAlumno.equals("***")) {  
            
            System.out.print("Ingrese la calificación de BASIC: ");
            calificacionBASIC = scanner.nextDouble();
            System.out.print("Ingrese la calificación de Pascal: ");
            calificacionPascal = scanner.nextDouble();
            System.out.print("Ingrese la calificación de FORTRAN: ");
            calificacionFORTRAN = scanner.nextDouble();
            
           
            promedio = (calificacionBASIC + calificacionPascal + calificacionFORTRAN) / 3;
            
            
            System.out.println("Alumno: " + nombreAlumno + ", Promedio: " + promedio);
            
            scanner.nextLine();  
            // Leer el nombre del siguiente alumno
            System.out.print("Ingrese el nombre del alumno (*** para finalizar): ");
            nombreAlumno = scanner.nextLine();
        }
        
       
    }
}
