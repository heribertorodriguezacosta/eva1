
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 16550688
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] aiArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) 
                {

                    aiArray[i][i] = 1;

                } else 
                {
                    aiArray[i][i] = 0;
                }
            
            System.out.print("[" + aiArray[i][i] + "]");
        }
        System.out.println("");
    }

    
}
}