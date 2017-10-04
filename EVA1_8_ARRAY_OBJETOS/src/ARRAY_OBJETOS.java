/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class ARRAY_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno aaDatosAlumno[]; //el identificador es nulo
        aaDatosAlumno = new Alumno[10]; //Creamos un arreglo de 10. Alumnos - AQUI HABRA PREGUNTA
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("heri", "16550688", 0);
            
        }
        
        for(Alumno aaDatosAlumno1 : aaDatosAlumno){
            System.out.println("Nombre: " + aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumno1.getsMatri());
            System.out.println("Carrerra: " + aaDatosAlumno1.getiCar());
        }
        Alumno aaDatosAlumnoCopia[];
        aaDatosAlumnoCopia = new Alumno [aaDatosAlumno.length];
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumnoCopia[i] = aaDatosAlumno[i];
        }
    }
    
}
//0 --> SISTEMAS
class Alumno{
    private String sNom;
    private String sMatri;
    private int iCar;

    public Alumno(String sNombre, String sMatricula, int iCarrera) {
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
    
    
}