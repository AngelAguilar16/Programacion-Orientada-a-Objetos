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

package formulageneral;

import javax.swing.JOptionPane;

public class FG{

    //Declaracion de coeficientes
    private double a,b,c;
    private double d = 0, r = 0, i = 0;

    public FG (double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public FG(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    //Calculo del discriminante
    public double discrim(){
        this.d = b*b - 4 * this.a * this.c;
        return this.d;
    }

    private double parteReal(){
        r = -(this.b / (2 * this.a * this.c));
        return r;
    }

    private void parteImag(){
        d = this.discrim();
        if(d >= 0){
            this.i = Math.sqrt(d) / (2 * this.a);
        }
        else{
            this.i = Math.sqrt(Math.abs(d)) / (2 * this.a);   
        }
    }

    public void solucion(){
        double x1,x2;
        this.parteReal();
        this.parteImag();
        if(this.discrim() >= 0){
            x1 = this.r + this.i;
            x2 = this.r + this.i;
            JOptionPane.showMessageDialog(null,"X1 = " + x1 + "\nX2 = " + x2);
        }
        else{
            String X1 = new String("X1 = " + r + " + " + i + "i");
            String X2 = new String("X2 = " + r + " - " + i + "i");
            JOptionPane.showMessageDialog(null,X1 + "\n" + X2);
        }
    }
}