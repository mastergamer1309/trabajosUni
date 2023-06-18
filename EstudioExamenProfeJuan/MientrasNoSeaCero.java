package EstudioExamenProfeJuan;
import java.util.Scanner;
public class MientrasNoSeaCero {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num = 0;


        do{
            System.out.println("ingrese un numero: ");
            num = scanner.nextInt();
            suma += num;
        }while(num !=0);

        System.out.println(suma);
        scanner.close();
    }
    
}
