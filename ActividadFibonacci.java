package com.mycompany.actividadfibonacci;

import java.util.List;

public class ActividadFibonacci {

    public static void main(String[] args) {
        //Lista de numeros
        List<Integer> listaNumeros;
        List<Integer> listaPares;
        List<Integer> listaNones;
        //Objeto de la clase Fibonacci
        Fibonacci _fibonacci = new Fibonacci();
        //Creacion de lista con secuencia de fibonacci
        listaNumeros = _fibonacci.listaFibonacci(1000000);
        
        //Objeto de la clase Splitter
        Splitter _splitter = new Splitter();
        //Obtener lista de numeros pares
        listaPares = _splitter.pares_imparesLista(listaNumeros, 1);
        //Obtener lista de numeros nones
        listaNones = _splitter.pares_imparesLista(listaNumeros, 2);
        
        //Imprimir listas
        System.out.println("Serie fibonacci");
        System.out.println(listaNumeros);
        System.out.println("Numeros pares");
        System.out.println(listaPares);
        System.out.println("Numeros nones");
        System.out.println(listaNones);
        
        //Objeto de la clase Manager
        Manager _manager = new Manager();
        //Generar archivo txt para guardar las listas
        _manager.ejecutar(listaNumeros, listaPares, listaNones);
    }
}
