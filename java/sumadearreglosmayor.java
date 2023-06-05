public class sumadearreglosmayor {
    public static void main(String []args){
        int numeros1[] = {2,2,2};
        int numeros2[] = {2,2,2};
        int numeros3[] = {25,765,345,67,34,7,3,6,3,6,3,};
        int repetidos[] = new int[numeros1.length];
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
        
        if(sumados > sumauno && sumados > sumatres){
            mayor = sumados;
        }else if(sumatres > sumados && sumatres > sumauno){
            mayor  = sumatres;
        }else{
            mayor= sumauno;
        }
        
        
        System.out.println("el arreglo mayor es: " + mayor);

        //Teniendo dos arreglos decir cuales y cuantoselementos del arreglo 1 estan tambien en el arreglo 2

        for(int i = 0; i < numeros1.length; i++){
            for(int j = 0; j < numeros2.length; j++){
                if(numeros1[i] == numeros2[j]){
                    repetidos[i] = numeros2[j];
                    for(int k = 0; i< numeros1.length; k++){
                        if(numeros2[j] == repetidos[k]){
                            System.out.println("el  numero en comun en la lista uno y lista dos es:" + numeros2 [j]);
                        }
                    }
                    
                    
                }
            }
            
        }

    }
    
}
