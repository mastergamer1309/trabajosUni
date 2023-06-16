
package EstudioExamenProfeJuan;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int aux;
    int numeros[] = new int[5]; 
    for (int i=0; i< numeros.length;i++){
        System.out.println("digite  un numero: " );
        numeros[i] = scanner.nextInt();
    }
    
    //metodoBurbuja

    for(int i=0;i<numeros.length-1;i++){
        for(int j = 0;j<numeros.length-1;j++){
            if(numeros[j]> numeros[j+1]){
                aux = numeros[j];
                numeros[j] = numeros[j+1];
                numeros[j+1] = aux;
            }
        }
    }
    System.out.println(Arrays.toString(numeros));
    scanner.close();
    }
    
}
