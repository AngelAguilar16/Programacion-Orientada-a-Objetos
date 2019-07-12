//Estudiante.java
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

public class Estudiante{

    private String nombre;
    private String nombre2;
    private String nombre3;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numCuenta;
    private String carrera;

    public static ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();

    public Estudiante(String n, String n2, String n3, String aP, String aM, int nC, String c){
        this.nombre = n;
        this.nombre2 = n2;
        this.nombre3 = n3;
        this.apellidoPaterno = aP;
        this.apellidoMaterno = aM;
        this.numCuenta = nC;
        this.carrera = c;
    }

    public String [] getEstudiantes(){
        String [] datos = {this.nombre, this.nombre2, this.nombre3, this.apellidoPaterno, this.apellidoMaterno, String.valueOf(this.numCuenta), this.carrera};
        return datos;
    }

    public static void cargarEstudiantes(){
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_2_Extra/universidad/Estudiantes.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";
        File archivo = new File(rutaArchivoWin);
        try{
            listaDeEstudiantes.clear();
            Scanner registroEs = new Scanner(archivo);
            while(registroEs.hasNext()){
                String datos = registroEs.next();
                String [] dato = datos.split(",");
                Estudiante e = new Estudiante(dato[0], dato[1], dato[2], dato[3], dato[4], Integer.parseInt(dato[5]), dato[6]);
                listaDeEstudiantes.add(e);
            }
            registroEs.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void listaEstudiantes(){
        cargarEstudiantes();
        String lista = "";
        Iterator<Estudiante> iter = listaDeEstudiantes.iterator();
        while(iter.hasNext()){
            Estudiante e = iter.next();
            String [] datos = e.getEstudiantes();
            lista += "Nombre: " + datos[0] + " " + datos[3] + " " + datos[4] + " " + " Numero de Cuenta: " + datos[5] + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public static void buscarEstudiante(){
        cargarEstudiantes();
        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Que estudiante busca? "));
        Iterator<Estudiante> iter = listaDeEstudiantes.iterator();
        String resultado = "";
        while(iter.hasNext()){
            Estudiante e = iter.next();
            String [] datos = e.getEstudiantes();
            if(String.valueOf(buscar).equals(datos[5])){
                resultado += "Nombre: " + datos[0] + " " + datos[1] + " " + datos[2] +  " " + datos[3] + " " + datos[4] + "\nNumero de Cuenta: " + datos[5] + "\nCarrera: " + datos[6];
            }
        }
        if(resultado.length() > 0){
            JOptionPane.showMessageDialog(null, resultado);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existen datos correspondientes a la busqueda");
        }
    }

    public static void agregarEstudiante(){
        BufferedWriter bw = null;
        FileWriter fw = null;
        String nombre,nombre2,nombre3,apellidoPaterno,apellidoMaterno,numCuenta,carrera;
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_2_Extra/universidad/Estudiantes.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";

        try {
            nombre = JOptionPane.showInputDialog(null, "Cual es el nombre del estudiante?");
            nombre2 = JOptionPane.showInputDialog(null, "Cual es el segundo nombre del estudiante? -Dejar en blanco si no se tiene");
            nombre3 = JOptionPane.showInputDialog(null, "Cual es el tercer nombre del estudiante? -Dejar en blanco si no se tiene");
            apellidoPaterno = JOptionPane.showInputDialog(null, "Cual es el apellido paterno del estudiante?");
            apellidoMaterno = JOptionPane.showInputDialog(null, "Cual es el apellido materno del estudiante?");
            numCuenta = JOptionPane.showInputDialog(null, "Cual es el numero de cuenta del estudiante?");
            carrera = JOptionPane.showInputDialog(null, "Cual es la carrera del estudiante?");
            String data = "\n" + nombre + "," + nombre2 + "," + nombre3 + "," + apellidoPaterno + "," + apellidoMaterno + "," + numCuenta + "," + carrera;
            File file = new File(rutaArchivoWin);
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("información agregada!");
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