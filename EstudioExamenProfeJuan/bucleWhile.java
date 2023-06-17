package EstudioExamenProfeJuan;
import java.util.Scanner;
public class bucleWhile {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos numeros quiere en pantalla");
        int contador = scanner.nextInt();
        int i = 1;

        while(i<= contador){
            System.out.println(i);
            i+= 2;
        }
    
        scanner.close();
    }
    
}
