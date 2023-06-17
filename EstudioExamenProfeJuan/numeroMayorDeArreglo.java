package EstudioExamenProfeJuan;
import java.util.Scanner;
public class numeroMayorDeArreglo {
    public static void main(String []args){
        //Crearemos un arreglo de 5 posiciones, para almacenar números enteros, y el programa al finalizar nos dirá cuál es el mayor de esos 5.
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[5];
        int mayor = arreglo[0];
        
        for(int i=0; i< arreglo.length;i++){
            System.out.println("ingrese el numero " + i);
            arreglo[i] = scanner.nextInt();

        }

        for(int i=1; i< arreglo.length;i++){
            if(arreglo[i]>mayor){
                mayor = arreglo[i];
            }
        }

        System.out.println("el numero mayor del arreglo es: " + mayor);

        scanner.close();
    }
    
}
