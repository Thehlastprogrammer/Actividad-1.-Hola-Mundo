package com.mycompany.actividadfibonacci;

import java.util.ArrayList;
import java.util.List;

public class Splitter {
    /*
    Autor:          Eddy
    Funcion:        pares_imparesLista
    Proposito:      Generar una sublista con los numeros pares o impares de la lista original
    Datos entrada:  Lista de numeros y la opcion: 1=Pares
    Datos salida:   Lista de enteros de numeros pares o impares, dependiendo el caso
    Fecha:          26 de marzo
    */
    public List<Integer> pares_imparesLista(List<Integer> listaNumeros, int opcion){
        //Lista de enteros temporal
        List<Integer> listaTemp = new ArrayList();
        //Se recorre cada valor de la lista original
        for(Integer num: listaNumeros){
            //Se quieren los pares
            if(opcion == 1){
                //Si el residuo de dividir entre 2 es 0, es par
               if(num % 2 == 0){
                    listaTemp.add(num);
                } 
            }
            //Se quieren los nones
            else{
                //Si el residuo de dividir entre 2 no es 0, es non
                if(num % 2 != 0){
                    listaTemp.add(num);
                }
            }
            
        }
        return listaTemp;
    }
}
