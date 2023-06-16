
package EstudioExamenProfeJuan;
import java.util.Scanner;
public class CalcularSumaDeTresNotas {
    //Hacer un programa que calcule e imprima la suma de tres calificaciones
    

    public static void main(String []args){
       CalcularSumaDeTresNotas cal = new CalcularSumaDeTresNotas();

       cal.calcularNota();
        
        
        
    }



    public void calcularNota(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una nota");
        Double x = scanner.nextDouble();
        System.out.println("Ingrese segunda nota");
        Double y = scanner.nextDouble();
        System.out.println("ingrese la tercera nota");
        Double z = scanner.nextDouble();
        
        System.out.println("la nota total es: " + (x+y+z));
        
        scanner.close();
    }
}
