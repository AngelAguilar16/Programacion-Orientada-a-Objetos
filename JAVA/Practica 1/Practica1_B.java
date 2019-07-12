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

import java.util.Scanner;

public class Practica1_B{

    //Declaraciones:
    static Scanner in = new Scanner(System.in);

    //Constantes
    static final double PI = 3.141592;

    //Variables
    static int ladoMayor = 0, ladoMenor = 0, radio = 0;
    static double catetoA = 0, catetoB = 0, hipotenusa = 0;
    static double area = 0, perimetro = 0;

    public static void main(String[] args){

        String menu = new String(
            "1. Geometria del rectangulo\n" +
            "2. Geometria de la circunferencia\n" +
            "3. Geometria del triangulo\n" +
            "9. Salir"
        );

        int op = 0;

        while(op != 9){
            try{
                System.out.println(menu);
                System.out.print(">> ");
                op = in.nextInt();
            }catch(Exception e){
                System.exit(-1);
            }
            switch(op){
                case 1: rectanguloGeo(); break;
                case 2: circuloGeo(); break;
                case 3: trianguloGeo(); break;
                case 9: System.exit(-1);
            }
        }
    }

    public static void rectanguloGeo(){

        System.out.print("Lado mayor: ");
        ladoMayor = in.nextInt();
        System.out.print("Lado menor: ");
        ladoMenor = in.nextInt();

        area = ladoMayor * ladoMenor;
        perimetro = (ladoMayor + ladoMenor) * 2;

        System.out.println("Area = " + area + " cm2\n" +
                            "Perimetro = " + perimetro + " cm");
    }

    public static void circuloGeo(){
        System.out.print("Ingresa el radio: ");
        radio = in.nextInt();
        area = PI * radio * radio;
        perimetro = 2 * PI * radio;
        System.out.println("Area = " + area + " cm2\n" +
                            "Perimetro = "+ perimetro + " cm");      
    }

    public static void trianguloGeo(){
        System.out.print("Base: ");
        catetoA = in.nextInt();
        System.out.print("Altura: ");
        catetoB = in.nextInt();
        hipotenusa = Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));

        area = (catetoA * catetoB) / 2;
        perimetro = catetoA + catetoB + hipotenusa;

        System.out.println("Area = " + area + " cm2\n" +
                            "Perimetro = " + perimetro + " cm");
    }
 }