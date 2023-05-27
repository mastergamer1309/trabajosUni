import java.util.Scanner;
public class pagotrabajador {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese las horas trabajadas:");
        int horas = scanner.nextInt();
        System.out.println("ingrese el pago por hora");
        int pagoporhora = scanner.nextInt();
        double resultado = (( pagoporhora * horas)-(pagoporhora * horas)* 0.20);
        System.out.println("el total de salario es: " + resultado + " unidades monetarias");
        scanner.close();

        







    }
    
}
