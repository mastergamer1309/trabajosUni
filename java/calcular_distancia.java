import java.util.Scanner;
public class calcular_distancia {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el tiempo: ");
        double tiempo = scanner.nextDouble();

        System.out.println("ingrese la velocidad: ");
        double velocidad = scanner.nextDouble();

        double resultado = velocidad * tiempo;
        System.out.println("la distancia es de: " + resultado + " Unidades de medida");

        scanner.close();
    }
    
}
