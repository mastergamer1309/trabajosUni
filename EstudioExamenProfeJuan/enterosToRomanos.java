package EstudioExamenProfeJuan;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class enterosToRomanos {
    
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String numeroRomano;
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if(numero <1 || numero >3999){
            System.out.println("el numero debe de estar entre 1 y 3999");
        }else{
            numeroRomano = convertirRomanos(numero);
            System.out.println(numero + "en numeros romanos es: " + numeroRomano);

        }
        scanner.close();



    }
    
    public static String convertirRomanos(int numero){
        String[] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] decenas = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] centenas = {"","C","CC","CCC","CD","D","DC","DCC","CM"};
        String[] miles = {"","M","MM","MMM"};


        int indexUnidades,indexDecenas,indexCentenas,indexMiles;


        indexUnidades = numero / 1000;
        numero = numero%1000;
        indexCentenas = numero / 100;
        numero = numero%100;
        indexDecenas = numero / 10;
        numero = numero%10;
        indexUnidades = numero;

        return miles[indexMiles] + centenas[indexCentenas] + decenas[indexDecenas] + unidades[indexUnidades];
    }

    

    
                                                                                                                                                                                          
     
}
