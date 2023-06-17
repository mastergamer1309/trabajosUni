package EstudioExamenProfeJuan;
import java.util.Scanner;
public class bucleDoWhile {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de terminos: ");
        int contador = scanner.nextInt();
        
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=contador);

        scanner.close();
    }
    
}
