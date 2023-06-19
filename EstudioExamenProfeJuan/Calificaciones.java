package EstudioExamenProfeJuan;
import java.util.Scanner;
public class Calificaciones {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double calificaciones[] = new double[6];
        int excelencia = 0;
            int aprobados = 0;
            int reprobados = 0;

        for(int i = 0;i<6;i++){
            System.out.println("ingrese una nota");
            calificaciones[i] = scanner.nextDouble();
            


        }

        for(int i=1;i<6;i++){
            if(calificaciones[i] >= 9 ){
                System.out.println("el usuario " +i+ " aprobo la clase con excelencia");
                excelencia ++;
            }else if(calificaciones[i] >=6){
                System.out.println("el usuario  " + i+ " ha aprobado la clase");
                aprobados ++;

            }else if(calificaciones[i] <6){
                System.out.println("el usuario " + i+ " no ha aprobado la clase :c");
                reprobados ++;
            }
        }

        System.out.println("la cantidad de usuarios aprobados es: " + aprobados + ", la cantidad de usuarios reprobados es de:" + reprobados + ", y la cantidad de usuarios con excelencia es: " + excelencia);
    }

    
}
