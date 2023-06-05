public class sumadearreglosmayor {
    public static void main(String []args){
        int numeros1[] = {12,23,46,45,78,345,34576,234,576,3434,65,34};
        int numeros2[] = {1,5,7,56,8,5,3,457,2,6,4,6,3456,75};
        int numeros3[] = {25,765,345,67,34,7,3,6,3,6,3,};
        int sumauno = numeros1[0];
        int sumados = numeros2[0];
        int sumatres = numeros3[0];

        for(int i = 1; i < numeros1.length;i++){
            sumauno += numeros1[i]; 
        }
        for(int i = 1; i < numeros2.length; i++){
            sumados += numeros2[i];
        }
        for(int i = 1; i<numeros3.length; i++){
            sumatres += numeros3[i];
        }

        System.out.println("el total de la primera es:" + sumauno + ", el total de la segunda es: " + sumados + "; y el total de la tercera es: " + sumatres);

        int mayor = sumauno;
        
        if(sumados<sumauno){
            mayor = sumados;
        }else if{
            mayor  = sumatres;
        }
        
        System.out.println("el arreglo mayor es: " + mayor);
    }
    
}
