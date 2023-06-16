package EstudioExamenProfeJuan;
import java.util.Arrays;
import java.util.Scanner;
public class eliminarDuplic {
    //Eliminar elementos duplicados de un array: Escribe un método que reciba un array de enteros y devuelva un nuevo array con los elementos duplicados eliminados.
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
        int numeros[] = new int[10];
        int eliminados[] = new int[numeros.length];
        for(int i=0; i< numeros.length; i++){
            System.out.println("ingrese un numero: ");
            numeros[i] = scanner.nextInt();
            System.out.println(Arrays.toString(numeros));

        }
        int comparar =  0;
        for(int i=0;i<numeros.length;i++){
            for(int j=1; j<numeros.length-1;j++){
                if(numeros[i] == numeros[j]){
                    eliminados[i] = numeros[j];

                }
            }
        }
        
        System.out.println("el array con los elementos duplicados es: \n");
        System.out.println(Arrays.toString(eliminados));
        
        
        
        scanner.close();            
    }
    

    



    
}
