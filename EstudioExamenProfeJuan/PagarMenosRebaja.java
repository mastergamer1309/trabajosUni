package EstudioExamenProfeJuan;
import java.util.Scanner;
public class PagarMenosRebaja {
    public static void main(String []args){
        //La pieza de pan cuesta a $5.  Si se compraron más de 50 piezas, cada pieza costará a $4.5 Si se compraron más de 100, cada pieza costará a $4.
        Scanner scanner =  new Scanner(System.in);
        double precioBase = 5.0;
        double PrecioCincuenta = 4.5;
        double precioCien = 4.0;

        System.out.println("ingrese la cantidad de unidades de pan a comprar: ");
        int cantidadPan = scanner.nextInt();

        if(cantidadPan <50 && cantidadPan > 0){
            
            System.out.println("el precio unitario del pan es de: " + precioBase + " y el total a pagar es: " + (cantidadPan * precioBase));
        }else if(cantidadPan >= 100){
            System.out.println("el precio unitario del pan es de: " + precioCien + " y el total a pagar es: " + (cantidadPan * precioCien));
        }else if(cantidadPan >=50){
            System.out.println("el precio unitario del pan es de: " + PrecioCincuenta + " y el total a pagar es: " + (cantidadPan * PrecioCincuenta));

        }else{
            System.out.println("ingrese un numero valido");
        }

           

        scanner.close();
    }
    
}
