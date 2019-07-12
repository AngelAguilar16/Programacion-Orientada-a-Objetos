//Carrera.java
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

import java.util.ArrayList;

public class Carrera{

    private String nombre;
    private String materia1;
    private String materia2;
    private String materia3;
    private String materia4;
    private String materia5;
    private String materia6;
    private String materia7;

    public static ArrayList<Carrera> listaDeCarreras = new ArrayList<>();

    public Carrera(String n, String m1, String m2, String m3, String m4, String m5, String m6, String m7){
        this.nombre = n;
        this.materia1 = m1;
        this.materia2 = m2;
        this.materia3 = m3;
        this.materia4 = m4;
        this.materia5 = m5;
        this.materia6 = m6;
        this.materia7 = m7;
    }

    public String [] getCarreras(){
        String [] datos = {this.nombre, this.materia1, this.materia2, this.materia3, this.materia4, this.materia5, this.materia6, this.materia7};
        return datos;
    }

    public static void cargarCarreras(){
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_2_Extra/universidad/Carrera.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";
        File archivo = new File(rutaArchivoWin);
        try{
            listaDeCarreras.clear();
            Scanner registroCar = new Scanner(archivo);
            while(registroCar.hasNext()){
                String datos = registroCar.next();
                String [] dato = datos.split(",");
                Carrera ca = new Carrera(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], dato[6], dato[7]);
                listaDeCarreras.add(ca);
            }
            registroCar.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void listaCarreras(){
        cargarCarreras();
        String lista = "";
        Iterator<Carrera> iter = listaDeCarreras.iterator();
        while(iter.hasNext()){
            Carrera ca = iter.next();
            String [] datos = ca.getCarreras();
            lista += "Nombre de carrera: " + datos[0] + "\n\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public static void agregarCarrera(){
        BufferedWriter bw = null;
        FileWriter fw = null;
        String nombre,materia1,materia2,materia3,materia4,materia5,materia6,materia7;
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_2_Extra/universidad/Carrera.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";

        try {
            nombre = JOptionPane.showInputDialog(null, "Cual es el nombre de la carrera que quieres agregar?");
            materia1 = JOptionPane.showInputDialog(null, "Cual es su primera materia?");
            materia2 = JOptionPane.showInputDialog(null, "Cual es su segunda materia?");
            materia3 = JOptionPane.showInputDialog(null, "Cual es su tercera materia?");
            materia4 = JOptionPane.showInputDialog(null, "Cual es su cuarta materia?");
            materia5 = JOptionPane.showInputDialog(null, "Cual es su quinta materia?");
            materia6 = JOptionPane.showInputDialog(null, "Cual es su sexta materia?");
            materia7 = JOptionPane.showInputDialog(null, "Cual es su septima materia?");
            String data = "\n" + nombre + "," + materia1 + "," + materia2 + "," + materia3 + "," + materia4 + "," + materia5 + "," + materia6 + "," + materia7;
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