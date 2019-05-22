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

public class Actividad{
    
    private String descripcion;
    private String fecha;

    public Actividad(String d, String f){
        this.descripcion = d;
        this.fecha = f;
    }

    public void setDescripcion(String des){
        this.descripcion = des;
    }

    public void setFecha(String fec){
        this.fecha = fec;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String getFecha(){
        return this.fecha;
    }
}