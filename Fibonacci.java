package com.mycompany.actividadfibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    /*
    Autor:          Eddy
    Funcion:        listaFibonacci
    Proposito:      Generar una lista de numeros siguiendo la secuencia fibonacci con un numero limite de la secuencia
    Datos entrada:  Integer del numero limite
    Datos salida:   Lista de enteros de la secuencua de fibonacci
    Fecha:          26 de marzo
    */
    public List<Integer> listaFibonacci(int limite){
        //Variables a actualizar
        int valor1=1;
        int valor2=0;
        int suma;
        //Lista de numeros temporal
        List<Integer> serieFibonacci = new ArrayList<>();
        //Se inicia la secuencia con el 1
        serieFibonacci.add(1);
        //Ciclo mientras no se llegue al numero limite
        do{
            suma = valor1 + valor2;
            serieFibonacci.add(suma);
            valor2 = valor1;
            valor1 = suma;
        }while(suma < limite);
        
        return serieFibonacci;
    }
}
