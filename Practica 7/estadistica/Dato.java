package estadistica;

public class Dato{

    private int valor;
    private double desviacion;
    //private Boolean es_moda;
    //private int frecuencia;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

    public void setDesviacion(double desviacion){
        this.desviacion = desviacion;
    }

    public double getDesviacion(){
        return this.desviacion;
    }

    /*public void setEs_moda(Boolean es_moda){
        this.es_moda = es_moda;
    }*/

}