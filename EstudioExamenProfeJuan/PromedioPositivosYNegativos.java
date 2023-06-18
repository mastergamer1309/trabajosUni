package EstudioExamenProfeJuan;
import java.util.Scanner;
public class PromedioPositivosYNegativos {
    public static void main(String []args){
        //Capturaremos 10 números enteros, y el programa al final nos dirá de esos 10 números, cuál es el promedio de los positivos, cuál fue de los negativos, y la cantidad de ceros ingresados.
        Scanner scanner = new Scanner(System.in);
        double sumaPositivos = 0;
        double cantidadPositivos = 0;
        double sumaNegativos = 0;
        double cantidadNegativos = 0;
        int cantidadCeros = 0;
        double promedioPositivos = 0;
        double promedioNegativos = 0;
        for(int i = 0; i< 10; i++){
            System.out.println("ingrese un numero entero");
            int numero = scanner.nextInt();
            
            if(numero == 0){
                cantidadCeros ++;

            }else if(numero > 0){
                sumaPositivos += numero;
                cantidadPositivos ++;
            }else{
                sumaNegativos += numero;
                cantidadNegativos++;

            }   
        }
        
        if(cantidadPositivos>0){
            promedioPositivos = sumaPositivos / cantidadPositivos;

        }
        if(cantidadNegativos>0){
            promedioNegativos = sumaNegativos / cantidadNegativos;

        }
        

        
        System.out.println("el promedio de los positivos es: " + promedioPositivos + ", el promedio de los negativos es: " + promedioNegativos + ", y la cantidad de ceros es: " + cantidadCeros);
        
        
        scanner.close();


    }
    
}
