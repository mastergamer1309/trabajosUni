
import java.util.Scanner;
public class metodos {
    public static void main(String []args){
        metodos instancia = new metodos();
        // instancia.leerNumeros();
        instancia.sumarNumeros(2,2);
        instancia.restarNumeros(2,2);
        instancia.multiplicarNumeros(2,2);
        instancia.dividirNumeros(2,2);
        instancia.mostrarResultados();
        
    



        
    }
    
    Scanner scanner = new Scanner(System.in);
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    // public void leerNumeros(){
    //     System.out.println("ingrese un numero: ");
    //     numero1 = scanner.nextInt();
    //     System.out.println("ingrese un segundo numero: ");
    //     numero2 = scanner.nextInt();
        
   
    // }

    public void sumarNumeros(int numero1, int numero2){
        suma = numero1+numero2;

    }        
        
    public void restarNumeros(int numero1,int numero2){
        resta = numero1-numero2;
    }

    public void multiplicarNumeros(int numero1,int numero2){
        multiplicacion = numero1 * numero2;
    }
    
    public void dividirNumeros(int numero1,int numero2){
        division = numero1 / numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("la suma es:" + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division);
    }


    
    
        
    
}
