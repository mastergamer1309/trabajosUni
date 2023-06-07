import java.util.Scanner;
public class elementoMenorDeArreglo {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
        int[] lista = new int[5];
        int elementoMayor = lista[0];

        for(int i = 0; i < lista.length; i++){
            System.out.println("ingrese un valor para la lista");
            lista[i] = scanner.nextInt();
            if (lista[i] < elementoMayor){
                elementoMayor = lista[i];
            }
        }
        
        System.out.println("el elemento mayor de esta lista es: " + elementoMayor);
        scanner.close();
    }
    
}
