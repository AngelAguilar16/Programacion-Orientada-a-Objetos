package autos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Autos{

    public static ArrayList<Auto> listaDeAutos = new ArrayList<>();

    public static String menu = new String(
        "1. Cargar lista de autos\n" +
        "2. Ver lista de autos\n" +
        "3. Buscar auto\n" +
        "4. Agregar auto\n" +
        "5. Salir"
    );

    public static void main(String[] args) {
        int op = 0;
        
        while(op != 3){
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                System.exit(-1);
            }

            switch(op){
                case 1:
                    cargarAutos();
                    break;
                case 2:
                    listaAutos();
                    break;
                case 3:
                    buscarAuto();
                    break;
                case 4:
                    agregarAuto();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion inexistente");
                    break;
                case 5:
                    System.exit(-1);
                    break;
            }
        }
    }

    public static void cargarAutos(){
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_4/autos/Autos.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";
        File archivo = new File(rutaArchivoWin);
        try{
            listaDeAutos.clear();
            Scanner registroAuto = new Scanner(archivo);
            while(registroAuto.hasNext()){
                String datos = registroAuto.next();
                String [] dato = datos.split(",");
                Auto a = new Auto(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
                listaDeAutos.add(a);
            }
            registroAuto.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void listaAutos(){
        String lista = "Marca - Linea - Modelo - Precio - Color\n\n\n";
        Iterator<Auto> iter = listaDeAutos.iterator();
        while(iter.hasNext()){
            Auto a = iter.next();
            String [] datos = a.getDatos();
            lista += datos[0] + " - " + datos[1] + " - " + datos[2] + " - " + datos[3] + " - " + datos[4] + "\n\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public static void buscarAuto(){
        String buscar = JOptionPane.showInputDialog(null,"Que auto busca? ");
        Iterator<Auto> iter = listaDeAutos.iterator();
        String resultado = "";
        while(iter.hasNext()){
            Auto a = iter.next();
            String [] datos = a.getDatos();
            if(buscar.equals(datos[0]) || buscar.equals(datos[1]) || buscar.equals(datos[2]) || buscar.equals(datos[3]) || buscar.equals(datos[4])){
                resultado += "Linea: " + datos[1] + " - " + "Precio: " + datos[3] + "\n";
            }
        }
        if(resultado.length() > 0){
            JOptionPane.showMessageDialog(null, resultado);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existen datos correspondientes a la busqueda");
        }
    }

    public static void agregarAuto(){
        BufferedWriter bw = null;
        FileWriter fw = null;
        String marca,linea,color,modelo,precio;
        String rutaArchivoWin = "C:/Users/Lenovo/Documents/GitHub/Java/Practica_4/autos/Autos.csv";
        //String rutaArchivoUb = "/home/ccfie172/Escritorio/Practica_5/autos/Autos.csv";

        try {
            marca = JOptionPane.showInputDialog(null, "Ingresa la marca del auto: ");
            linea = JOptionPane.showInputDialog(null, "Ingresa la linea del auto: ");
            modelo = JOptionPane.showInputDialog(null, "Ingresa el modelo del auto: ");
            precio = JOptionPane.showInputDialog(null, "Ingresa el precio del auto: ");
            color = JOptionPane.showInputDialog(null, "Ingresa el color del auto: ");
            String data = "\n" + marca + "," + linea + "," + modelo + "," + precio + "," + color;
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