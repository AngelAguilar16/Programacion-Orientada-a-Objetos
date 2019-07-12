//Calificacion.java
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

public class Calificacion{

    private int numCuenta;
    private int calificacion1;
    private int calificacion2;
    private int calificacion3;
    private int calificacion4;
    private int calificacion5;
    private int calificacion6;
    private int calificacion7;

    public static ArrayList<Calificacion> listaDeCalificaciones = new ArrayList<>();

    public Calificacion(int nC, int c1, int c2, int c3, int c4, int c5, int c6, int c7){
        this.numCuenta = nC;
        this.calificacion1 = c1;
        this.calificacion2 = c2;
        this.calificacion3 = c3;
        this.calificacion4 = c4;
        this.calificacion5 = c5;
        this.calificacion6 = c6;
        this.calificacion7 = c7;
    }

    public String [] getCalificaciones(){
        String [] datos = {String.valueOf(this.numCuenta), String.valueOf(this.calificacion1), String.valueOf(this.calificacion2), String.valueOf(this.calificacion3), String.valueOf(this.calificacion4), String.valueOf(this.calificacion5), String.valueOf(this.calificacion6), String.valueOf(this.calificacion7)};
        return datos;
    }
    
    public static void cargarCalificaciones(){
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_2_Extra/universidad/Calificaciones.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";
        File archivo = new File(rutaArchivoWin);
        try{
            listaDeCalificaciones.clear();
            Scanner registroCa = new Scanner(archivo);
            while(registroCa.hasNext()){
                String datos = registroCa.next();
                String [] dato = datos.split(",");
                Calificacion c = new Calificacion(Integer.parseInt(dato[0]), Integer.parseInt(dato[1]), Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), Integer.parseInt(dato[4]), Integer.parseInt(dato[5]), Integer.parseInt(dato[6]), Integer.parseInt(dato[7]));
                listaDeCalificaciones.add(c);
            }
            registroCa.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void listaCalificaciones(){
        cargarCalificaciones();
        String lista = "";
        Iterator<Calificacion> iter = listaDeCalificaciones.iterator();
        while(iter.hasNext()){
            Calificacion c = iter.next();
            String [] datos = c.getCalificaciones();
            lista += "Num Cuenta: " + datos[0] + " , " + datos[1] +  " , " + datos[2] + " , " + datos[3] + " , " + datos[4] + " , " + datos[5] + " , " + datos[6] + " , " + datos[7] + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public static void buscarCalificacion(){
        cargarCalificaciones();
        String buscar = JOptionPane.showInputDialog(null,"Que alumno busca? ");
        Iterator<Calificacion> iter = listaDeCalificaciones.iterator();
        String resultado = "";
        while(iter.hasNext()){
            Calificacion c = iter.next();
            String [] datos = c.getCalificaciones();
            if(buscar.equals(datos[0])){
                if(buscar.equals("20150804")){
                    resultado += "Las calificaciones del alumno con numero de cuenta " + datos[0] + " son: \n" + 
                            "\nMemes: " + datos[1] + 
                            "\nEdits cool: " + datos[2] + 
                            "\nStickers HD: " + datos[3] + 
                            "\nMemes Neuronales: " + datos[4] + 
                            "\nRedes Sociales: " + datos[5] + 
                            "\nMemingles: " + datos[6] + 
                            "\nProgramacion Orientada a Memes: " + datos[7] + 
                            "\n\n";
                }
                else{
                    resultado += "Las calificaciones del alumno con numero de cuenta " + datos[0] + " son: \n" + 
                            "\nProgramaci\u00f3n orientada a objetos: " + datos[1] + 
                            "\nSistemas digitales: " + datos[2] + 
                            "\nServicios de internet " + datos[3] + 
                            "\nM\u00e9todos num\u00e9ricos: " + datos[4] + 
                            "\nDesarrollo emprendedor: " + datos[5] + 
                            "\nCiclo de vida del desarrollo de software: " + datos[6] + 
                            "\nIngl\u00e9s II: " + datos[7] + 
                            "\n\n";
                }
            }
        }
        if(resultado.length() > 0){
            JOptionPane.showMessageDialog(null, resultado);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existen datos correspondientes a la busqueda");
        }
    }

    public static void agregarCalificacion(){
        BufferedWriter bw = null;
        FileWriter fw = null;
        String numCuenta,materia1,materia2,materia3,materia4,materia5,materia6,materia7;
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_2_Extra/universidad/Calificaciones.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";

        try {
            numCuenta = JOptionPane.showInputDialog(null, "Cual es el numero de cuenta del estudiante al que quieres agregar las calificaciones?");
            materia1 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la primera materia?");
            materia2 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la segunda materia?");
            materia3 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la tercera materia?");
            materia4 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la cuarta materia?");
            materia5 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la quinta materia?");
            materia6 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la sexta materia?");
            materia7 = JOptionPane.showInputDialog(null, "Cual es su calificacion de la septima materia?");
            String data = "\n" + numCuenta + "," + materia1 + "," + materia2 + "," + materia3 + "," + materia4 + "," + materia5 + "," + materia6 + "," + materia7;
            File file = new File(rutaArchivoWin);
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("informacion agregada!");
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}