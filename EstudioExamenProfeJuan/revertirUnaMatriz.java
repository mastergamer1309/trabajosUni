package EstudioExamenProfeJuan;
import java.util.Arrays;
public class revertirUnaMatriz {
    public static void main(String []args){
        int arreglo[] = {0,4,7,3,6,2,5,4,3,5};
        int arreglo2[] = new int[arreglo.length];
        
        int indiceArreglo = 0;
        for(int i=arreglo.length-1;i>=0;i--){
            arreglo2[indiceArreglo] = arreglo[i];
            indiceArreglo++;
            
            

        }
        
        

        System.out.println(Arrays.toString(arreglo2));
    }
    

}
