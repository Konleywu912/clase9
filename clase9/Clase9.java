/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author leymanwu
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo; "));
        Estudiante arrEstudiante[] = new Estudiante[tamanio];

        //Llenando el arreglo
        arrEstudiante = llenar_arreglo(arrEstudiante);
        //mOstrando el arreglo
        mostrar_arreglo(arrEstudiante);

    }
    
    public static String generar_nombre(){
        String nombres[] ={
            "Ana",
            "Pedro",
            "María",
            "Juan",
            "Alicia",
            "Santiago",
            "Patricia",
            "Alixia",
            "Christian"
        };
        
        Random rand = new Random();
        int num = rand.nextInt(nombres.length);
        return nombres[num];
        
        
    }

    public static Estudiante[] llenar_arreglo(Estudiante[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedular") + (i + 1));
            String nombre = generar_nombre();
            String apellidos = JOptionPane.showInputDialog("Digite tus apellidos") + (i + 1);

            Estudiante estudiante_i = new Estudiante(cedula, nombre, apellidos);
            arreglo[i] = estudiante_i;

        }
        return arreglo;
    }

    public static void mostrar_arreglo(Estudiante[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(
                    null, "Estudiante " + (i + 1) + ": "
                    + arreglo[i]/*.getCedular() + " " +arreglo[i].getNombre() +
                            " " + arreglo[i].getApellidos()*/
            );

        }

    }
}
