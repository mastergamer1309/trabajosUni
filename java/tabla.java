import java.util.Scanner;
public class tabla {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la tabla a multiplicar: ");
        int numero = scanner.nextInt();

        for (int i = 1;i <= 12; i++){
            System.out.println(numero + " por " + i + " es: " + (numero * i));
        }
    
        scanner.close();
    }
    
}
