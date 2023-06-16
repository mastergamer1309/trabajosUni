package EstudioExamenProfeJuan;
import java.util.Scanner;
public class ContarMayusculas {
    public static void main(String []args){
        //Contar letras mayúsculas: Escribe un método que reciba una cadena de texto y devuelva el número de letras mayúsculas que contiene.
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese un texto: ");
        String texto = scanner.next();
        String textoUpperCase = texto.toUpperCase();
        char TextoNormal[] = texto.toCharArray();
        
        char TextoUC[] = textoUpperCase.toCharArray();

        for(int i = 0; i < texto.length(); i++){
            if(TextoNormal[i] == TextoUC[i]){
                contador ++;
            }            
        }
        System.out.println("la cantidad de letras en mayuscula son: " + contador);

        
        
        scanner.close();

    }
    
}
