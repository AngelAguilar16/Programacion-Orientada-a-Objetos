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

import formulageneral.FG;

public class FormulaGeneral{

    public static void main(String[] args){
        
        String menu = new String(
            "1. Nueva ecuacion\n" +
            "2. Resolver ecuacion\n" +
            "9. Salir"
        );

        //FG fg = new FG(0, 0, 0);
        FG fg = new FG();

        int op = 0;

        while(op != 9){

            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }
            catch(Exception e){
                System.exit(-1);
            }

            switch(op){
                case 1: String coef = JOptionPane.showInputDialog(null, "Coeficientes\n" + 
                                                                        "de la forma a,b,c");
                        String [] array_coef = coef.split(",");
                        fg.setA(Double.parseDouble(array_coef[0]));
                        fg.setB(Double.parseDouble(array_coef[1]));
                        fg.setC(Double.parseDouble(array_coef[2]));
                        double d = fg.discrim();
                        JOptionPane.showMessageDialog(null, "Discriminante = " + d);
                        break;
                case 2: fg.solucion();
                        break;
                case 9: System.exit(-1);
            }
        }
    }

}