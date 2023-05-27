import java.util.Scanner;
public class numeroprimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("proporcione un numero");
        int numero = scanner.nextInt();
        int contador = 0;
        if (numero > 1){
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0){
                    contador += 1;
                }else{
                    break;
                }
            }
        } else{
            System.out.println("el numero debe de ser positivo");
        }

        if (contador > 0){
            System.out.println("el numero no es primo");

        }else{
            System.out.println("el numero es primo");
        }
        
        scanner.close();

    }
    
}
