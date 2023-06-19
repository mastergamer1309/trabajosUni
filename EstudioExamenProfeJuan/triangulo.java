package EstudioExamenProfeJuan;
import java.util.Scanner;

import javax.swing.SpringLayout;  
public class triangulo {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String symbol = "*";
        System.out.println("ingrese la cantidad de filas");
        int rows = scanner.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(symbol);

            }
            System.out.println("");
        }

        System.out.println("\n\n");

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(symbol);


            }
            System.out.println("");
        }

        



    }
    
}
