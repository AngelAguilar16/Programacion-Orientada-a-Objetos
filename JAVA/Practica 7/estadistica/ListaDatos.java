package estadistica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListaDatos{

    private ArrayList<Dato> datos = new ArrayList<>();

    private double media;
    private double desviacion_estandar;
    private HashMap<Integer,Integer> frecuencias = new HashMap<Integer,Integer>();

    public ListaDatos(){

    }

    public void agregarDato(Dato d){
        this.datos.add(d);
    }

    public void limpiarDatos(){
        this.datos.clear();
    }

    public ArrayList<Dato> getDatos(){
        return this.datos;
    }

    public void setMedia(){
        Iterator<Dato> iter = this.datos.iterator();
        int s = 0;
        int n = this.datos.size();
        while(iter.hasNext()){
            Dato d = iter.next();
            s += Math.pow(d.getValor() - this.media, 2);
        }
        this.media = (double)s / (double)n;
    }

    public double getMedia(){
        return this.media;
    }

    public void setDesviacionEstandar(){
        Iterator<Dato> iter = this.datos.iterator();
        int s = 0;
        int n = this.datos.size();
        while(iter.hasNext()){
            Dato d = iter.next();
            s += d.getValor();
        }
        this.desviacion_estandar = Math.sqrt((double)s / (double)n);

        for(Dato d : this.datos){
            d.setDesviacion(d.getValor() - this.desviacion_estandar);
        }
    }

    public double getDesviacionEstandar(){
        return this.desviacion_estandar;
    }

    public void setFrecuencia(){
        Iterator<Dato> iter = this.datos.iterator();
        int k = 0;
        Integer v = 0;
        while(iter.hasNext()){
            Dato d = iter.next();
            k = d.getValor();
            v = (Integer)frecuencias.get(k);
            if(v == null){
                frecuencias.put(k, 1);
            }
            else{
                v++;
                frecuencias.put(k, v);
            }
        }
    }

    public HashMap<Integer,Integer> getFrecuencia(){
        return this.frecuencias;
    }
    
}