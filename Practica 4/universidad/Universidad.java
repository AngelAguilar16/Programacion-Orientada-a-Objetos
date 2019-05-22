//Universidad.java
package universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Universidad{

    public static String menu = new String("1. Agregar estudiante\n" +
                            "2. Ver lista de estudiantes\n" +
                            "3. Buscar estudiante\n" +
                            "4. Agregar calificaciones\n" +
                            "5. Ver lista de calificaciones\n" +
                            "6. Buscar calificaciones\n" +
                            "7. Agregar carrera\n" +
                            "8. Ver lista de carreras\n" +
                            "9. Salir");

    public static void main(String[] args){
        int op = 0;
 
        while(op != 9){
 
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }
            catch(Exception e){
                System.exit(-1);
            }
 
            switch(op){
                case 1:
                    Estudiante.agregarEstudiante();
                    break;
                case 2: 
                    Estudiante.listaEstudiantes();
                    break;
                case 3: 
                    Estudiante.buscarEstudiante();
                    break;
                case 4:
                    Calificacion.agregarCalificacion();
                    break;
                case 5:
                    Calificacion.listaCalificaciones();
                    break;
                case 6:
                    Calificacion.buscarCalificacion();
                    break;
                case 7:
                    Carrera.agregarCarrera();
                    break;
                case 8:
                    Carrera.listaCarreras();
                    break;
                case 9: 
                    System.exit(-1);
                    break;
            }
        }
    }

}