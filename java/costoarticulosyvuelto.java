import java.util.Scanner;
public class costoarticulosyvuelto {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de articulos: ");
        double cantidad = scanner.nextDouble();

        System.out.println("ingrese el precio unitario del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("con cuanto pagara?");
        double pago = scanner.nextDouble();

        double total = precio * cantidad;
        double vuelto = pago - total;


        System.out.println("el total de su compra son: " + total + " y su vuelto es: " + vuelto);
        scanner.close();
    }
    
}
