package EstudioExamenProfeJuan;

public class VentasMes {
    //arreglo de 30 ventas de un mes y decir cuales ventas son mayores a 2000 pesos
    public static void main(String []args){
        int ventasDelMes[] = new int[30];

        for(int i = 1; i< ventasDelMes.length; i++){
            ventasDelMes[i] = (int) (Math.random() * 3000);
            System.out.println(ventasDelMes[i]);

        }
        for (int i = 0;i< ventasDelMes.length;i++){
            if(ventasDelMes[i] > 2000){
                System.out.println("la venta del dia " + (i) + " es mayor a 2000");
            }
        }
    }
}
