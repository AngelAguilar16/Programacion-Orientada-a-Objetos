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

package listapendientes;
import javax.swing.JOptionPane;

public class ListaPendientes{

    public static Lista listp = new Lista();

    public static void main(String[] args){
        String menu = new String("1. Agregar actividad\n" +
                            "2. Ver lista\n" +
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
                case 1: listp.nuevaActividad();
                        break;
                case 2: listp.verLista();
                        break;
                case 9: break;
            }
        }
    }

}