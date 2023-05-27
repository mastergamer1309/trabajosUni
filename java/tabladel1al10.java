import java.util.Scanner;
public class tabladel1al10 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu \n 1-Encontrar Mayor \n 2-Acceso de Usuario \n 3-Imprimir Tabla \n 4-Salir \n Ingrese el numero segun la opcion");
            opcion = scanner.nextInt();

        }while(opcion != 4);





        scanner.close();
    }
}
