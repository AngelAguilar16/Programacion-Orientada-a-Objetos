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
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Lista{

    ArrayList<Actividad> actividades = new ArrayList<>();

    public int estado = 0;

    public Lista(){
        this.estado = 1;
    }

    public int getEstado(){
        return this.estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
    }

    public void nuevaActividad(){
        String descripcion = JOptionPane.showInputDialog(null, "Descripcion de la actividad: ");
        String fecha = JOptionPane.showInputDialog(null, "Fecha de la actividad: ");
        Actividad activity = new Actividad(descripcion,fecha);
        this.agregarActividad(activity);
    }

    public void agregarActividad(Actividad actividad){
        actividades.add(actividad);
    }

    public void verLista(){
        Iterator<Actividad> itr = actividades.iterator();
        String lista = new String();
        int num = 1;

        while(itr.hasNext()){
            Actividad act = itr.next();
            String description = act.getDescripcion();
            String date = act.getFecha();
            lista += num + ".- " + description + " - " + date + "\n";
            num += 1;
        }

        JOptionPane.showMessageDialog(null, lista);
    }

}