package EstudioExamenProfeJuan;

public class triangulo {
    public static void main(String []args){
        triangulo hola = new triangulo();

        hola.triaangulo(5);
    }


    public void triaangulo(int filas){
        for(int i=1;i<=filas;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
