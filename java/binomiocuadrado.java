import java.util.Scanner;
public class binomiocuadrado {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa el numero 'a': ");
        double a = scanner.nextDouble();
        
        System.out.println("ingrese el numero 'b': ");
        double b = scanner.nextDouble();

        double bincuad = ((a*a) + (2 *(a*b)) + (b*b));

        System.out.println("el resultado del a * b es: " + bincuad);
        scanner.close();
    }
}
