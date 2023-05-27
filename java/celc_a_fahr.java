import java.util.Scanner;
public class celc_a_fahr {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese los grados celius a convertir: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("el total de fahrenheit son: " + fahrenheit);
        
        scanner.close();
    }

    
}
