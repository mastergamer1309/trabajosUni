import  java.util.Scanner;

public class usuarioycontrasenia {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("ingrese la contrasenia: ");
        String contrasenia = scanner.nextLine();

        if (nombreUsuario == "admin" && contrasenia == "1234"){
            System.out.println("Has ingresado");
        }else{
            System.out.println("no puedes pasar");
        };
        scanner.close();
    }
    
}
