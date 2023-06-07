import java.util.Scanner;
import java.util.Arrays;
public class mediaPares {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[5];
        int contadorMedia = 0;
        int totalmedia = 0;

        for(int i=0; i < array.length; i++){
            System.out.println("ingrese un valor para el arreglo");
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0){
                contadorMedia += array[i];
                totalmedia += 1;

            }
         
            
                   
        }
        System.out.println("la lista es: " + Arrays.toString(array) + ", y la media de los numeros primos es: " + contadorMedia / totalmedia);
        
        
        scanner.close();
    }
    
}
