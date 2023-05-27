import java.util.Scanner;
public class diadelasemana {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un dia de la semana en numeros: ");
        int numero = scanner.nextInt();

        String diaSemana;
        switch (numero) {
            case 1:
            diaSemana = "lunes";
            break;
            case 2:
            diaSemana = "martes";
            break;
            case 3:
            diaSemana = "miercoles";
            break;
            case 4:
            diaSemana = "jueves";
            break;
            case 5:
            diaSemana = "viernes";
            break;
            case 6:
            diaSemana = "sabado";
            break;
            case 7:
            diaSemana = "domingo";
            break;
            default:
            diaSemana = "numero invalido";
            break;


        }
        scanner.close();
        System.out.println("el numero " + numero + " es el dia " + diaSemana);




    }

    
}
