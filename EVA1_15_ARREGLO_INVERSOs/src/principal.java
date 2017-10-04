
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krono
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] num,numInv;
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        n=sc.nextInt();
        num=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero entero");
            num[i]=sc.nextInt();
        }
        
        numInv=new int[n];
        for (int i = 0; i < n; i++) {
            numInv[i]=num[n-i-1];
        }
        
        System.out.println("Arreglo original");
        for (int i :num) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Arreglo inverso");
        for (int i :numInv) {
            System.out.print(i+" ");
        }
    }
    
}
