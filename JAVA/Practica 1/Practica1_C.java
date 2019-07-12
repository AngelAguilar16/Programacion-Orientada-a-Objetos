/****************************************************************************
 * Copyright (C) 2019 by Angel Aguilar       
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.                             *
 ****
*/

import javax.swing.JOptionPane;

public class Practica1_C {

    public static void main(String[] args){

        String menu = new String(
            "1. Geometria del rectangulo\n" +
            "2. Geometria de la circunferencia\n" +
            "3. Geometria del triangulo\n" + 
            "9. Salir"
        );

        Rectangulo Rect = new Rectangulo();
        Circulo Circ = new Circulo();
        Triangulo Tri = new Triangulo();
        int op = 0;

        while(op != 9){
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }catch(Exception e){
                System.exit(-1);
            }
            switch(op){
                case 1: Rect.rectanguloGeo(); break;
                case 2: Circ.circuloGeo(); break;
                case 3: Tri.trianguloGeo(); break;
                case 9: System.exit(-1);
            }
        } 
    }
}

class Figura {

    //Constantes
    static final double PI = 3.141592;

    //Variables
    public double area = 0, perimetro = 0;

    public void resultadoMostrado(){
        JOptionPane.showMessageDialog(null,"Area = " +this.area + " cm2\n" +
                                            "Perimetro = " + this.perimetro + " cm");
    }
}

class Rectangulo extends Figura {

    private int ladoMayor = 0, ladoMenor = 0;

    public void rectanguloGeo(){
        ladoMayor = Integer.parseInt(JOptionPane.showInputDialog(null, "Lado mayor"));
        ladoMenor = Integer.parseInt(JOptionPane.showInputDialog(null, "Lado menor"));

        this.area = ladoMayor * ladoMenor;
        this.perimetro = (ladoMayor + ladoMenor) * 2;
        this.resultadoMostrado();
    }
}

class Circulo extends Figura {

    private int radio = 0;

    public void circuloGeo(){
        radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el radio"));
        this.area = PI * radio * radio;
        this.perimetro = 2 * PI * radio;
        this.resultadoMostrado();
    }
}

class Triangulo extends Figura {

    private double catetoA = 0,catetoB = 0, hipotenusa = 0;

    public void trianguloGeo(){
        catetoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Base: "));
        catetoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));
        hipotenusa = Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));

        this.area = (catetoA * catetoB) / 2;
        this.perimetro = catetoA + catetoB + hipotenusa;
        this.resultadoMostrado();
    }
}