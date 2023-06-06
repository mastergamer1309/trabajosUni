import java.util.Arrays;
import java.util.Scanner;
public class CeroParesUnoImpares {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[5];

        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Ingrese cualquier webada");
            arreglo[i] = scanner.nextInt();
        
        }
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 == 0){
                arreglo[i] = 1;
            }else{
                arreglo[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arreglo));

        scanner.close();
    }
    
}
