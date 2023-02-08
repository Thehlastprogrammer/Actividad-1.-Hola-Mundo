package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author Carlos Eduardo Wydler 173957
 * 
 */
public class Examen {
    
    
    public static void main(String[] args){
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        String frase;
        int opcion=1;
        //Mientras el usuario no ponga 0 ciclar
        while(opcion != 0){
            //Menu de opciones
            opcion = Examen.Menu();
            switch (opcion) {
                case 1:
                    System.out.print("Frase: ");
                    frase = input.nextLine();
                    System.out.println(Examen.primeraMayuscula(frase));
                    break;
                case 2:
                    System.out.print("Cadena: ");
                    frase = input.nextLine();
                    System.out.println(Examen.invertirCadena(frase));
                    break;
                case 3:
                    System.out.print("Frase: ");
                    frase = input.nextLine();
                    System.out.println(Examen.vocalesMayuscula(frase));
                    break;
                case 4:
                    Examen.fizzBuzz();
                    break;
                case 5:
                    System.out.println("Frase: ");
                    frase = input.nextLine();
                    if(Examen.palindromo(frase) == 1){
                        System.out.println("La frase es palindroma");
                    }
                    else{
                        System.out.println("La frase NO es palindroma");
                    }
                    break;
                default:
                    if(opcion != 0)
                        System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    
    /*
    Autor:              Carlos Eduardo Wydler 173957
    Funcion:            Menu
    Proposito:          Mostrar menu de opciones
    Datos de entrada:   NA
    Datos de salida:    int opcion
    Fecha:              3 de febrero de 2023
    */
    public static int Menu(){
        int opcion;
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("Elige una opcion");
        System.out.println("1. Primera mayuscula");
        System.out.println("2. Invertir Cadena");
        System.out.println("3. Vocales en mayuscula");
        System.out.println("4. FizzBuzz");
        System.out.println("5. Palindromo");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    /*
    Autor:              Carlos Eduardo Wydler 173957
    Funcion:            primeraMayuscula
    Proposito:          Convertir la primera letra de una frase en mayuscula
    Datos de entrada:   String frase
    Datos de salida:    La nueva frase 'fraseTemp'
    Fecha:              3 de febrero de 2023
    */
    public static String primeraMayuscula(String frase){
        //Guardar un string en donde la primera letra de 'frase' sea mayuscula + el resto de la cadena 'frase'
        String fraseTemp = frase.toUpperCase().charAt(0) + frase.substring(1, frase.length());
        //System.out.println(fraseTemp);
        return fraseTemp;
    }
    
    /*
    Autor:              Carlos Eduardo Wydler 173957
    Funcion:            invertirCadena
    Proposito:          Invertir una cadena
    Datos de entrada:   String cadena
    Datos de salida:    La nueva cadena 'cadenaTemp'
    Fecha:              3 de febrero de 2023
    */
    public static String invertirCadena(String cadena){
        String cadenaTemp = "";
        char caracter;
        //Recorrer cada caracter del string 'cadena'
        for(int i = 0; i<cadena.length(); i++){
            //Cada caracter se agregara al inicio de la cadena 'cadenaTemp'
            caracter = cadena.charAt(i);
            cadenaTemp = caracter + cadenaTemp;
        }
        //System.out.println(cadenaTemp);
        return cadenaTemp;
    }
    
    /*
    Autor:              Carlos Eduardo Wydler 173957
    Funcion:            vocalesMayuscula
    Proposito:          Convertir las vocales de una cadena en mayusculas
    Datos de entrada:   String cadena
    Datos de salida:    La nueva cadena 'cadenaTemp'
    Fecha:              3 de febrero de 2023
    */
    public static String vocalesMayuscula(String cadena){
        String cadenaTemp = "";
        //Recorre los caracteres de la cadena
        for(int i = 0; i<cadena.length(); i++){
            //Si el caracter es vocal (a, e, i, o, u) lo convierte en mayuscula y lo agrega a la cadena 'cadenaTemp'
            if(cadena.charAt(i)== 'a' || cadena.charAt(i)== 'e' || cadena.charAt(i)== 'i'
                    || cadena.charAt(i)== 'o' || cadena.charAt(i)== 'u'){
                cadenaTemp += cadena.toUpperCase().charAt(i);
            }
            //Agrega el caracter como esta en la cadena 'cadenaTemp'
            else{
                cadenaTemp += cadena.charAt(i);   
            }
        }
        //System.out.println(cadenaTemp);
        return cadenaTemp;
    }
    
    /*
    Autor:              Carlos Eduardo Wydler 173957
    Funcion:            fizzBuzz
    Proposito:          Mostrar numero del 1-100 sustituyendo los multiplos de 3 por 'Fizz
                        multiplos de 5 por 'Buzz' y multiplos de 3 y 5 por 'FizzBuzz'
    Datos de entrada:   NA
    Datos de salida:    Impresion en pantalla de los numeros
    Fecha:              3 de febrero de 2023
    */
    public static void fizzBuzz(){
        //Recorrer los numeros del 1-100
        for(int i = 1; i<=100; i++){
            //Si el residuo de dividir el numero entre 3 y 5 es 0
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            //Si el residuo de dividir el numero entre 3 es 0
            else if(i%3==0){
                System.out.println("Fizz");
            }
            //Si el residuo de dividir el numero entre 5 es 0
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
    /*
    Autor:              Carlos Eduardo Wydler 173957
    Funcion:            palindromo
    Proposito:          Comprobar si una frase es palindroma
    Datos de entrada:   String frase
    Datos de salida:    Impresion en pantalla True o False
    Fecha:              3 de febrero de 2023
    */
    public static int palindromo(String frase){
        String fraseTemp = "";
        int frasePalindromo = 1;
        //Crear una frase temporal sin espacios
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) != ' '){
                fraseTemp += frase.charAt(i);
            }
        }
        //De la frase temporal crear una nueva donde todas las letras sean minusculas
        String fraseNueva = fraseTemp.toLowerCase();
        //Comprar si la cadena es palindroma
        int k = fraseNueva.length() - 1;
        for(int j=0; j<fraseNueva.length(); j++){
            if(fraseNueva.charAt(j) != fraseNueva.charAt(k)){
                frasePalindromo = 0;
                break;
            }
            k--;
        }
        return frasePalindromo;
    }
