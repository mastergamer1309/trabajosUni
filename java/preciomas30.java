import java.util.Scanner;
public class preciomas30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el precio de venta del producto: ");
        double precio = scanner.nextDouble();

        double Total = precio + (precio * 0.30);
        
        System.out.println(" el precio del producto con ganancia es de: " + Total);
        
        scanner.close();
    }
    
}
