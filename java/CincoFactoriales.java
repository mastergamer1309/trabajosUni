import java.util.Scanner;

public class CincoFactoriales {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.println("ingrese un valor para el arreglo");
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i <= array.length; i++){
            contador *= i;
            System.out.println("el factorial de " + i + " es: " + contador);

        }
        
        
        
        
        
        scanner.close();
    }
    
}
