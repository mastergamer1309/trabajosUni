package EstudioExamenProfeJuan;
import java.util.Scanner;
public class numerosPositivos {
    public static void main(String []args){
        //Usando un ciclo while, haremos este programa. Se nos pedirán una indeterminada cantidad de números, con la condición que sólo sean positivos. Y el programa sumará esos números, y obtendrá su promedio.
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int suma = 0;
        


        while(n>=0){
            System.out.println("ingrese numeros positivos: ");
            n = scanner.nextInt();
            if(n>0){
                i++;
                suma +=n;
            }else{
                break;
            }
            
            
        }


        int promedio = suma/i;
        System.out.println("el promedio de la suma de los numeros es: " + promedio);
        scanner.close();
    }
    
}
