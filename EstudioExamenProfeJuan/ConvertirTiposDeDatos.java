package EstudioExamenProfeJuan;
import java.util.Scanner;
public class ConvertirTiposDeDatos {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double num = 10.2;

        int numInt = (int) num;
        System.out.println(numInt);
        
        //para convertir una string a entero se utiliza un metodo  ya que string es una clase, asi que lo que vamos a hacer es poner Integer.parseInt(string a convertir);


        String cantidad = "15";

        int cantInt = Integer.parseInt(cantidad);

        System.out.println(cantInt * numInt);
        
        //para convertir una string a double es un metodo similar, sollo que primero ponemos el tiempo de dato que en este caso sera double:

        double cantdouble = Double.parseDouble(cantidad);

        //ahora para convertir de un entero o un doble hacia un String:

        int edad = 17;
        Double estatura = 1.80;

        String edads = String.valueOf(edad);
        String estaturas = String.valueOf(estatura);

        System.out.println(edads);
        System.out.println(estaturas);

        System.out.println(cantInt * cantdouble);
        scanner.close();

        
    }
    
}
