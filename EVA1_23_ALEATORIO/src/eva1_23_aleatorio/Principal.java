/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_aleatorio;

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]aiArray= new int[5][5];
        for (int i = 0; i < aiArray.length; i++) {
            for (int j = 0; j < aiArray.length; j++) {
                
            aiArray[i][j]= (int)(Math.random()*100)+1;
           System.out.print("[ " + aiArray[i][j]+" ] ");
        }  
            System.out.println("");
           
           
        }
        System.out.println("\n");
        System.out.println("Matriz inversa");
        int [][]aiCopiaArray= new int[5][5];
         aiCopiaArray= new int [5][5];
         for (int i = 0; i < aiArray.length; i++) {
             for (int j = 0; j < aiArray.length; j++) {
                 aiCopiaArray[i][j]= aiArray[4-i][4-j];
                 
                 System.out.print(" [" + aiArray[i][j]+" ] ");
             }
             System.out.println("");
        }
    }
    
}
