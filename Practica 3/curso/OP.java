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

package curso;
import javax.swing.JOptionPane;

public class OP{

    //Declaracion de variables
    private double a, b, c, x = 0, y = 0, z = 0;

    public OP(){
        
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
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public double operation(){
        double cuadrado, numero, resultado;
        cuadrado = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el cuadrado: "));
        numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el numero: "));
        resultado = numero * cuadrado;
        return resultado;
    }

}