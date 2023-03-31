package com.mycompany.examen3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Lector {
    //Limites para la obtencion de datos de las filas
    private int contador = 0;
    private int limite = 50;
    private int contadorLimite = 0;
    //Lecutra del archivo .csv
    private BufferedReader lector;
    private String linea;
    private String partes[];
    private String pathArchivo = "";
    
    
    
    public void ejecutar(int id){
        //Obtener los ultimos 3 numeros del id para definir la fila
        String idTemp = Integer.toString(id);
        String newStringId = idTemp.substring(idTemp.length()-3, idTemp.length());
        int newId = Integer.parseInt(newStringId)+1;
        //Lista para guardar las palabras y cantidad de veces que se repiten
        List<String> listaPalabras = new ArrayList();
        List<Integer> cantidadPalabras = new ArrayList();
        try{
            //Leer archivo .csv
            lector = new BufferedReader(new FileReader(pathArchivo));
            //Mientras siga encontrando filas
            while((linea = lector.readLine()) != null){
                //Guardamos las palabras (columnas)
                if(contador == 0){
                    partes = linea.split(",");
                    for (int i=0; i<partes.length; i++) {
                        if(i>0 && i<(partes.length - 1)){
                           listaPalabras.add(partes[i]);  
                            cantidadPalabras.add(0); 
                        }
                    }
                }
                //Sumamos al contador de filas
                contador += 1;
                //Contador es mayor o igual al valor de los ultimos 3 digitos del id
                if(contador >= newId){
                    //contador limite se suma
                    contadorLimite += 1;
                    //Contador limite es menor o igual al limite total de filas que se utilizaran
                    if(contadorLimite <= limite){
                        //Separamos todas las columnas en un arreglo
                        partes = linea.split(",");
                        //Actualizamos valores de cantidad de repeticion por palabra
                        for (int k=0; k<partes.length; k++) {
                            //Se consideran todas excepto la primera (correo) y la ultima (spam)
                            if(k>0 && k<(partes.length-2)){ 
                                cantidadPalabras.set((k-1), cantidadPalabras.get(k-1)+Integer.valueOf(partes[k]));
                            }
                        }
                    }//end if contadorLimite
                    //Se terminan las filas que se quieren evaluar
                    if(contadorLimite > limite){
                        break;
                    }
                }//end if contador
            }//end while
            //Cerrar la lectura del archivo y limpiar las variables
            lector.close();
            linea = null;
            partes = null;
        }//end try
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        //Guardar informacion en archivo txt
        guardarInformacion(id, cantidadPalabras, listaPalabras);
    }//end ejecutar
    
    
    private void guardarInformacion(int id, List<Integer> cantidades, List<String> palabras){
        //Se intenta crear/guardar la informacion
        try{
            //Se especifica la ruta
            String ruta = "/" + Integer.toString(id) + ".txt";
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
            for(int i=0; i<palabras.size(); i++){
                bw.write(palabras.get(i) + ", " + cantidades.get(i));
                bw.newLine();
            }
            //Cerrar la escritura en el archivo
            bw.close();
        }//end try
        catch(Exception e){
            e.printStackTrace();
        }
    }//end guardarInformacion
    
}
