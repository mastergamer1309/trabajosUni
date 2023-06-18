package EstudioExamenProfeJuan;

public class multipPrimerosDiezImpares {
    public static void main(String []args){

        int totalImpares = 1;
        int contador =0;
        int numero =1;
        while(contador<10){
            if(numero %2 != 0){
                totalImpares *=numero;
                contador ++;

            }
            numero++;
        }


        System.out.println(totalImpares);
        
        
    }
    
}
