import java.util.Scanner;
import java.util.Arrays;
public class CifradoCesar {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        //realizar cifrado cesar, desplazar una letra las posiciones de rotacion proporcionadas en el abecedario
        String Abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z","a",};
        System.out.println("ingrese una palabra para cifrar");
        String UserWord[] = {scanner.next()};
        String SplittedText[] = UserWord[0].split("");
        System.out.println(Arrays.toString(SplittedText));
        String CipherText[] = new String[SplittedText.length];


        System.out.println("ingrese el numero de rotaciones");
        int rotaciones = scanner.nextInt();
        


        for (int i = 0;i < SplittedText.length;i++){
            for(int j = 0; j < Abc.length; j++){
                if(SplittedText[i].equals(Abc[j])){
                    int FinalRotation = (j + rotaciones) % Abc.length;

                    CipherText[i] = Abc[FinalRotation];

                }
            }
        }
        scanner.close();

        System.out.println(Arrays.toString(CipherText));
   
   
    }
    
}
