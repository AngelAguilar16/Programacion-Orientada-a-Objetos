package autos;

public class Auto{

    private final String marca;
    private final String linea;
    private final int modelo;
    private final int precio;
    private final String color;

    public Auto(String m, String l, int mo, int p, String c){
        this.marca = m;
        this.linea = l;
        this.modelo = mo;
        this.precio = p;
        this.color = c;
    }

    public String [] getDatos(){
        String [] datos = {this.marca, this.linea, String.valueOf(this.modelo), String.valueOf(this.precio), this.color};
        return datos;
    }

}