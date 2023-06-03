public class ochoprimos {
    public static void main(String[]args){
        
        int primos[] = new int[8];
        int contador = 2;
        while (contador < primos.length){
            for(int i = 2; i < contador; i++){
                if(contador % i == 0){
                    contador ++;
                    break;
                }else{
                    primos[i] = contador;
                    contador ++;
                }
                
            }
         for( int i = 0; i < primos.length; i++){
            System.out.println(primos[i]);
            
         }
        }
        
    }
    
}
