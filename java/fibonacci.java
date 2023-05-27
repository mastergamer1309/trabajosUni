import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hasta que numero desea elaborar la sucesion?: ");
        int numero = scanner.nextInt();
        int numeroanteriordos = 0; 
        int numeroanterior = 1;
        int numeroactual = 1;
        for (int i = 0; i < numero; i++){
            System.out.println(numeroactual);
            numeroactual = numeroanterior + numeroanteriordos;
            numeroanteriordos = numeroanterior;
            numeroanterior = numeroactual;
            
            
        }
        scanner.close();
    }
    
}
