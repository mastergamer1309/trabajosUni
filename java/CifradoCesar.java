import java.util.Scanner;
import java.util.Arrays;
public class CifradoCesar {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        //realizar cifrado cesar, desplazar una letra las posiciones de rotacion proporcionadas en el abecedario
        String abecedario[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z","a",};
        System.out.println("ingrese una palabra para cifrar");
        String palabraDeUsuario[] = {scanner.next()};
        String textoseparado[] = palabraDeUsuario[0].split("");
        System.out.println(Arrays.toString(textoseparado));
        String textoCifrado[] = new String[textoseparado.length];


        System.out.println("ingrese el numero de rotaciones");
        int rotaciones = scanner.nextInt();
        


        for (int i = 0;i < textoseparado.length;i++){
            for(int j = 0; j < abecedario.length; j++){
                if(textoseparado[i].equals(abecedario[j])){
                    int rotacionFinal = (j + rotaciones) % abecedario.length;

                    textoCifrado[i] = abecedario[rotacionFinal];

                }
            }
        }
        scanner.close();

        System.out.println(Arrays.toString(textoCifrado));
   
   
    }
    
}
