package estadistica;

import java.util.Random;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Estadistica {

    public static ListaDatos LD = new ListaDatos();

    public static String menu = new String(
        "1.- Cargar datos.\n" +
        "2.- Calcular la media.\n" +
        "3.- Calcula la desviacion estandar.\n" +
        "4.- Obtener frecuencias.\n" +
        "5.- Ver datos.\n" +
        "9.- Salir.");

        public static void main(String[] args){
            int op= 0;
            while(op!= 9)
            {
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }catch(Exception e){
                System.exit(-1);
            }
            switch(op){
                case 1: 
                    cargarDatos(); 
                    break;
                case 2: 
                    calcularMedia(); 
                    break;
                case 3: 
                    calcularDesviacionEstandar();
                    break;
                case 4: 
                    obtenerFrecuencias();  
                    break;
                case 5:
                    verDatos();
                    break;
                case 9: 
                    System.exit(-1);
                    break;
            }
        }
    }

    public static void cargarDatos(){
        Random r = new Random();
        LD.limpiarDatos();
        for(int i = 0; i < 20; i++){
            Dato d = new Dato();
            d.setValor(r.nextInt(10) + 1);
            LD.agregarDato(d);
        }
        JOptionPane.showMessageDialog(null, "Lista cargada con exito!");
    }

    public static void verDatos(){
        Iterator<Dato> iter = LD.getDatos().iterator();
        int i = 1;
        while(iter.hasNext()){
            Dato d = iter.next();
            System.out.println(i++ + ".\t" + d.getValor() + "\t" + d.getDesviacion());
        }
    }

    public static void calcularMedia(){
        LD.setMedia();
        JOptionPane.showMessageDialog(null,"Media = " + LD.getMedia());
    }

    public static void calcularDesviacionEstandar(){
        LD.setDesviacionEstandar();
        JOptionPane.showMessageDialog(null,"DE = " + LD.getDesviacionEstandar());
    }

    public static void obtenerFrecuencias(){
        LD.setFrecuencia();
        Iterator<Integer> iter = LD.getFrecuencia().keySet().iterator();
        int k,v,i = 1;
        while(iter.hasNext()){
            k = (Integer)iter.next();
            v = (Integer)LD.getFrecuencia().get(k);
            System.out.println(i++ + ".\t" + k + "\t" + v);
        }
    }
}                                                                                     