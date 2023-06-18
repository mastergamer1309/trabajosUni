package EstudioExamenProfeJuan;

public class clasemath {
    public static void main(String []args){
        //sacar la raiz cuadrada Math.sqrt
        int raiz = 25;
        
        double raizz = (double)Math.sqrt(raiz);

        System.out.println(raizz);

        //elevar al cuadrado Math.pow

        double exponente = 2;
        double base = 5;

        System.out.println(Math.pow(base,exponente));


        //Redondear un numero: Math.round, Math.ceil, Math.floor


        double numero = 2.54;

        System.out.println(Math.round(numero));

        //random

        int num[] = new int[10];

        for(int i=0;i<num.length;i++){
            num[i] = (int) (Math.random() * 2000);
            System.out.println(num[i]);
        }
        

    }


    
}
