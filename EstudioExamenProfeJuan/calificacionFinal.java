package EstudioExamenProfeJuan;
import java.util.Scanner;
public class calificacionFinal {
    public static void main(String []args){
        // La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la participacion: ");
        Float participacion = scanner.nextFloat();
        System.out.println("ingrese la nota de su primer examen: ");
        Float primerExamen = scanner.nextFloat();
        System.out.println("ingrese la nota de su segundo examen: ");
        Float segundoExamen = scanner.nextFloat();
        System.out.println("ingrese la nota de su tercer examen: ");
        Float tercerExamen = scanner.nextFloat();
        participacion *= 0.10F;
        primerExamen *= 0.25F;
        segundoExamen *= 0.25F;
        tercerExamen *= 0.40F;

        double notaFinal = (participacion + primerExamen + segundoExamen + tercerExamen);
        Math.ceil(notaFinal);
        System.out.println(notaFinal);
        scanner.close();

    }
    
}
