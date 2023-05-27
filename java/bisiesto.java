import java.util.Scanner;
public class bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese un anio: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            System.out.println("el anio es bisiesto");

        } else{
            System.out.println("el anio no es bisiesto");

        }
        
        
        
        scanner.close();

    }
    
}
