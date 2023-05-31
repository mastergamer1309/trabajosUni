import  java.util.Scanner;
public class arreglos {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] listauno = new int [5];
        int[] listados = new int [5];
        int[] listatres = new int [5];
        for(int i = 0; i < listauno.length; i++){
            System.out.println("ingrese un valor: ");
            listauno[i] = scanner.nextInt();
        }
        for(int j = 0; j < listauno.length; j++){
            System.out.println("ingrese un valor: ");
            listados[j] = scanner.nextInt();
        }

        for (int k = 0; k < listatres.length; k++){
            listatres[k] = (listauno[k] * listados[k]);
        }
    scanner.close();
    }
    
}
