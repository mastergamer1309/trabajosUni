package EstudioExamenProfeJuan;

import java.util.*;

public class trianguloCentrado {
    public static void main(String []args){

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese la palabra: ");
    String inputWord = input.nextLine();
    inputWord.toLowerCase();
    System.out.println(inputWord);

    String[] letters = inputWord.split("");

    System.out.println(Arrays.toString(letters));

    String[] invertedArray = new String[letters.length];
    
    int j = 0;
    for (int i=letters.length-1;i>=0;i--){
        invertedArray[i] = letters[j];
        j++;
    }

    int count = 0;
    for (int i = 0;i<letters.length;i++){
        if (letters[i].equals(invertedArray[i])){
            count++;
        }
    }

    if (count==letters.length){
        System.out.println("Es palindromo!");
    } else {
        System.out.println("No es palindromo.");
    }

        input.close();
    }
}
