package EstudioExamenProfeJuan;
import java.util.Scanner;
public class Leftpiramid {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un simbolo para formar la piramide: ");
        char simbolo = scanner.next().charAt(0);
        System.out.println(simbolo);
        
        System.out.println("Ingrese el numero de filas: ");
        int size = scanner.nextInt();

        for(int i = 1; i<= size; i++){
            for(int j = 1; j<= i;j++){
                System.out.print(simbolo);
            }
         System.out.println("");   
        }
        
        
        System.out.println("\n");
        
        
        
        for(int i = size; i>= 1; i--){
            for(int j = 1; j<= i;j++){
                System.out.print(simbolo);
            }
            System.out.println();   
        }


        scanner.close();



        System.out.println("\n");

        for(int i = 1; i<= size; i++){
            for(int j = size-i; j >= 1;j--){
                System.out.print(" ");
            }
         for(int k =1; k<=i;k++){
            System.out.print(simbolo + " ");
         }   
         System.out.println();
        }
        
    }
    
}
