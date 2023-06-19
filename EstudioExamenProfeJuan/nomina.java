package EstudioExamenProfeJuan;
import java.util.Scanner;
//hacer un programa cuyo objetivo sea resolver los calculos de una tabla de nomina, el programa debe solicitar la cantidad de empleados que se van a digitar, solicitar toda la informacion y realizar sus calculos correspondientes y  mostrarlos como tabla. Me lleva la verga.
public class nomina {
    //variables
    String nombre;
    Double SalarioMensual;
    int horasExtra;
    int anios;
    double inss;
    double IngresoHorasExtra;
    double comisiones;
    public static void main(String []args){
        
        
        
        
        




         

         
    }

    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        nombre = scanner.next();
        System.out.println("ingrese su salario mensual");
        SalarioMensual = scanner.nextDouble();
        System.out.println("Ingrese las horas extra trabajadas: ");
        horasExtra = scanner.nextInt();
        System.out.println("ingrese los anios trabajados en la empresa: ");
        anios = scanner.nextInt();
        System.out.println("ingrese las deducciones");
        System.out.println("ingrese su comision: ");
        scanner.close();

        


    }

    public void calcularHorasExtra(){
        IngresoHorasExtra = ((((SalarioMensual/30)/8)*2)*horasExtra);


    }
    public void calcularTotalIngresos(){

    }
    public void calcularIr(){

    }
    public void calcularInss(){

    }
    
}
