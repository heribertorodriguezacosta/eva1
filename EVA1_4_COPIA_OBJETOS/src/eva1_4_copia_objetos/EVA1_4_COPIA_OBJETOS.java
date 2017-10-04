/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_copia_objetos;

/**
 *
 * @author temporal2
 */
public class EVA1_4_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i =5;
        System.out.println("i = "+i);
        //CREAR UNA COPIA DE I
        int iCopia=i;//ASIGNAMOS EL VARLOR DE I A LA VARIABLE COPIA
        System.out.println("Copia de i = ; "+iCopia);
        i++;
        System.out.println("i++= "+i);
        System.out.println("icopia = "+iCopia);
        
        //DECLARAR UN OBJETO DE TIPO NUMERO
        Numero nVal = new Numero();//CREAMOS EL OBJETO
        System.out.println("Valor de nVal.i= "+nVal.i);
        Numero nCopiaVal=nVal;//CREAMOS UNA COPIA <---NO ES UNA COPIA 
        System.out.println("Valor de ncOPIAvAL.i= "+nCopiaVal.i);
        nVal.i++;
        //IMPRIMIMOS nVal y nCopiaVal
        System.out.println("Valor de nVal.i= "+nVal.i);
        System.out.println("Valor de ncOPIAvAL.i= "+nCopiaVal.i);
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        //COPIA REAL DE UN OBJETO 
        Numero nCopiaReal = new Numero();
        nCopiaReal.i=nVal.i;
        System.out.println(nVal.i);
        System.out.println(nCopiaReal.i);
        nVal.i++;
        System.out.println(nVal.i);
        System.out.println(nCopiaReal.i);
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }
    
}
    class Numero{
    public int i =10;
    }