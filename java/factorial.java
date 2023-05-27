import java.util.Scanner;
public class factorial {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el factorial a calcular: ");
        int numero = scanner.nextInt();
        int contador = 1;
        for (int i = 1; i <= numero; i++){
            contador *= i;
        }
        
        System.out.println("el factorial de " + numero + " es: " + contador);
        scanner.close();
    
    }  

    
}
