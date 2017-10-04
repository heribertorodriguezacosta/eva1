
import java.util.Scanner;

/*PROYECTO INICIAL PARA CONOCER E IDENTIFICAR LOS TIPOS DE DATOS PRIMITIVOS EN JAVA*/
/**
 *
 * @author 16550688
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String sNom;
       int iEdad;
       double dSal;
        Scanner sScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        sNom=sScanner.nextLine();
          System.out.println("Introduce tu edad: ");
        iEdad=sScanner.nextInt();
          System.out.println("Introduce tu salario: ");
        dSal=sScanner.nextDouble();
        hacerAlgo(sNom, iEdad, dSal);
    }

    /**
     * Ejemplo para comentarios usando javadoc
     * @param sNombre ejemplo suando string
     * @param iEdad ejemplo usando enteros
     * @param dSalario ejemplo usando doubles
     */
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre+" "+iEdad+" "+dSalario);
    }
}
