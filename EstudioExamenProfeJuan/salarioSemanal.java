package EstudioExamenProfeJuan;
import java.util.Scanner;
public class salarioSemanal {
    public static void main(String []args){
        //Hacer un programa que calcule e imprima el salario semanal deun empleado a parrtir de sus horas semanales trabajadas y de su salario por hora
        salarioSemanal XD = new salarioSemanal();
        XD.salariosemanal();
        
    }
    
    
    public void salariosemanal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese las horas semanales trabajadas");
        double hora = scanner.nextDouble();

        System.out.println("ingrese el pago por hora");
        double pago = scanner.nextDouble();

        System.out.println("su salario semanal es de: " + (pago*hora));
        scanner.close();
    }




}

