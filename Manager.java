package com.mycompany.actividadfibonacci;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Manager {
    /*
    Autor:          Eddy
    Funcion:        ejecutar
    Proposito:      Generar un archivo txt con la informacion de las listas creadas
    Datos entrada:  Lista original de fibonacci, Lista de los numeros pares, Lista de los numeros nones
    Datos salida:   NA
    Fecha:          26 de marzo
    */
    public void ejecutar(List<Integer> fibonacci, List<Integer> pares, List<Integer> nones){
        //Se intenta crear/guardar la informacion
        try{
            //Se especifica la ruta
            String ruta = "/informacion.txt";
            //Se define el archivo en la ruta
            File file = new File(ruta);
            //Si no existe el archivo se crea
            if(!file.exists()){
                file.createNewFile();
            }
            //Se crea una variable para escribir y grabar informacion en el archivo txt
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            //Escribir en el archivo
            bw.write("Serie fibonacci");
            //Hacer un salto de linea en el archivo
            bw.newLine();
            for(Integer num: fibonacci){
                bw.write(String.valueOf(num) + " ");
            }
            bw.newLine();
            bw.write("Numeros pares");
            bw.newLine();
            for(Integer num: pares){
                bw.write(String.valueOf(num) + " ");
            }
            bw.newLine();
            bw.write("Numeros nones");
            bw.newLine();
            for(Integer num: nones){
                bw.write(String.valueOf(num) + " ");
            }
            //Cerrar la conexion con el archivo de texto
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
