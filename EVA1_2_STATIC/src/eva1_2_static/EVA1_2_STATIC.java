/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_static;

/**
 *
 * @author temporal2
 */
public class EVA1_2_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClasePrueba mcpObjeto = new MiClasePrueba();
        
        mcpObjeto.imprimirMensaje();
        System.out.println(mcpObjeto.sNom);
        MiClasePrueba2.imprimirMensaje();
        System.out.println(MiClasePrueba2.sNom);
    }
    
}
class MiClasePrueba{
    public String sNom = "Pau";
    public void imprimirMensaje(){
        System.out.println("Hola Mundo!!");
    }
}

class MiClasePrueba2{
    public static String sNom = "Pau";
    public static void imprimirMensaje(){
        System.out.println("Hola Mundo!!");
    }
}
