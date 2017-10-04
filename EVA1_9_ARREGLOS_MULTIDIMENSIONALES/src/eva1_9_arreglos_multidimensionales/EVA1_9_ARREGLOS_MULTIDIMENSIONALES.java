/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidimensionales;

/**
 *
 * @author temporal2
 */
public class EVA1_9_ARREGLOS_MULTIDIMENSIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS MULTIDIMENSIONALES ARREGLOS DE ARREGLOS
        //MATRIZ DE 2X2 DIMENSIONES[filas][columnas]
        int aiMatriz [][]=new int [2][2];//4 ENTEROS
        //LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < 2; i++) {//CADA FILA
            for (int j = 0; j < 2; j++) {//CADA COLUMNA
               aiMatriz[i][j]=(int)(Math.random()*10)+1;//LLENAR 1-10 
            }
            
        }
        //IMPRIMIR
        for (int i = 0; i < 2; i++) {//CADA FILA
            for (int j = 0; j < 2; j++) {//CADA COLUMNA
                System.out.print("["+aiMatriz[i][j]+"]");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
        //USANDO FOR EACH
        for (int[] aiMatriz1 : aiMatriz) {//CADA FILA
            //USANDO OTRO FOR EACH //RECORRER COLUMNAS
            for (int b : aiMatriz1) {
                System.out.print("["+b+"]");
                
            }
            System.out.println("");
        }
    }
    
}
