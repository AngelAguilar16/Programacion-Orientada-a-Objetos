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

public class Curso{

    public static void main(String[] args) {
        OP oper = new OP();

        String menu = new String("1. Nueva ecuacion\n" +
                                "2. Resolver cuadrado\n" +
                                "9. Salir");    

        int op = 0;
        while(op != 9){
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }
            catch(Exception e){
                System.exit(-1);
            }
            switch(op){
                case 1:
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, oper.operation());
                case 9:
                    System.exit(-1);
            }
        }
    }

}