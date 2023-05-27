import java.util.Scanner;
public class calcular_velocidad {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la  distancia: ");
        double distancia = scanner.nextDouble();

        System.out.println("ingrese el tiempo: ");
        double tiempo = scanner.nextDouble();

        double velocidad = (distancia / tiempo);
        System.out.println(velocidad);
        

        scanner.close();

    }
    
}
