package com.mycompany.circulo;

import java.util.Scanner;

/**
 *
 * @author Carlos Eduardo Wydler 173957
 */
public class Circulo {
    
    //Metodos---------------------------------------------
    //Mostrar arreglos
    public static void mostrarNumeros(int[] num){
        int i;
        System.out.println("Arreglo de numeros");
        for(i=0; i<num.length; i++){
            System.out.print(" " + num[i]);
        }
    }
    public static void mostrarNombres(String[] nom){
        int i;
        System.out.println("Arreglo de nombres");
        for(i=0; i<nom.length; i++){
            System.out.print(" " + nom[i]);
        }
    }
    public static void mostrarCirculos(Circulo[] cir){
        int i;
        System.out.println("Arreglo de objetos circulo");
        for(i=0; i<cir.length; i++){
            System.out.print(" " + cir[i]);
        }
    }
    //Buscar elemento en arreglos
    public static int buscarNumeros(int[] num, int valor){
        int i;
        System.out.println("Buscar elemento " + valor);
        for(i=0; i<num.length; i++){
            if(num[i] == valor){
                return i;
            }
        }
        return -1;
    }
    public static int buscarNombres(String[] nom, String valor){
        int i;
        System.out.println("Buscar elemento " + valor);
        for(i=0; i<nom.length; i++){
            if(nom[i].equals(valor)){
                return i;
            }
        }
        return -1;
    }
    public static int buscarCirculos(Circulo[] cir, Circulo valor){
        int i;
        System.out.println("Buscar elemento " + valor);
        for(i=0; i<cir.length; i++){
            if(cir[i] == valor){
                return i;
            }
        }
        return -1;
    }
    //Eliminar elemento en arreglos
    public static void eliminarNumeros(int[] num, int cajon){
        int i;
        for(i=cajon; i<(num.length - 1); i++){
            num[i] = num[i+1];
        }
        num[(num.length - 1)] = 0;
    }
    public static void eliminarNombres(String[] nom, int cajon){
        int i;
        for(i=cajon; i<(nom.length - 1); i++){
            nom[i] = nom[i+1];
        }
        nom[(nom.length - 1)] = null;
    }
    public static void eliminarCirculos(Circulo[] cir, int cajon){
        int i;
        for(i=cajon; i<(cir.length - 1); i++){
            cir[i] = cir[i+1];
        }
        cir[(cir.length - 1)] = null;
    }
    
    //MENU
    public static int menu(){
        int opcion;
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("Elige una opcion");
        System.out.println("1. Numeros");
        System.out.println("2. Nombres");
        System.out.println("3. Objeto Circulo");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    //MENU NUMEROS
    public static int menuNumeros(){
        int opcion;
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("Elige una opcion");
        System.out.println("1. Añadir numero");
        System.out.println("2. Buscar numero");
        System.out.println("3. Eliminar numero");
        System.out.println("4. Mostrar numeros");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    //MENU NOMBRES
    public static int menuNombres(){
        int opcion;
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("Elige una opcion");
        System.out.println("1. Añadir nombre");
        System.out.println("2. Buscar nombre");
        System.out.println("3. Eliminar nombre");
        System.out.println("4. Mostrar nombres");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    //MENU OBJETOS CIRCULO
    public static int menuCirculos(){
        int opcion;
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("Elige una opcion");
        System.out.println("1. Añadir objeto circulo");
        System.out.println("2. Mostrar objeto circulo");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    //Main-------------------------------------------------
    public static void main(String[] args) {
        //Atributos--------------------------------------------
        int numeros_array[] = new int[15];
        String nombres_array[] = new String[20];
        Circulo circulos_array[] = new Circulo[100];
        
        numeros_array[9] = 5;
        nombres_array[0] = "Francisco";
        
        int cajon;
        
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        int numero;
        int cajonActualNumeros = 0;
        String nombre;
        int cajonActualNombres = 1;
        int cajonActualCirculos = 0;
        
        int opcion = 1;
        //MENU GENERAL
        while(opcion != 0){
            opcion = menu();
            if(opcion != 0){
                switch (opcion) {
                //MENU NUMEROS
                case 1:
                    while(opcion != 0){
                        opcion = menuNumeros();
                        switch(opcion){
                            //Añadir
                            case 1:
                                System.out.print("Numero: ");
                                numero = input.nextInt();
                                numeros_array[cajonActualNumeros] = numero;
                                cajonActualNumeros += 1;
                                break;
                            //Buscar
                            case 2:
                                System.out.print("Numero a buscar: ");
                                numero = input.nextInt();
                                cajon = buscarNumeros(numeros_array, numero);
                                if(cajon != -1){
                                    System.out.println("Elemeto encontrado: " + numeros_array[cajon] + " en el cajon: " + cajon);
                                }
                                else{
                                    System.out.println("Elemento no encontrado");
                                }
                                break;
                            //Eliminar
                            case 3:
                                System.out.print("Numero a eliminar: ");
                                numero = input.nextInt();
                                cajon = buscarNumeros(numeros_array, numero);
                                if(cajon != -1){
                                    eliminarNumeros(numeros_array, cajon);
                                    cajonActualNumeros -= 1;
                                }
                                else{
                                    System.out.println("No se encontro el numero");
                                }
                                break;
                            //Mostrar
                            case 4:
                                mostrarNumeros(numeros_array);
                                break;
                        }
                    }   
                    break;
                //MENU NOMBRES
                case 2:
                    while(opcion != 0){
                        opcion = menuNombres();
                        switch(opcion){
                            //Añadir
                            case 1:
                                System.out.print("Nombre: ");
                                nombre = input.nextLine();
                                nombres_array[cajonActualNombres] = nombre;
                                cajonActualNombres += 1;
                                break;
                            //Buscar
                            case 2:
                                System.out.print("Nombre a buscar: ");
                                nombre = input.nextLine();
                                cajon = buscarNombres(nombres_array, nombre);
                                if(cajon != -1){
                                    System.out.println("Elemeto encontrado: " + nombres_array[cajon] + " en el cajon: " + cajon);
                                }
                                else{
                                    System.out.println("Elemento no encontrado");
                                }
                                break;
                            //Eliminar
                            case 3:
                                System.out.print("Nombre a eliminar: ");
                                nombre = input.nextLine();
                                cajon = buscarNombres(nombres_array, nombre);
                                if(cajon != -1){
                                    eliminarNombres(nombres_array, cajon);
                                    cajonActualNombres -= 1;
                                }
                                else{
                                    System.out.println("No se encontro el nombre");
                                }
                                break;
                            //Mostrar
                            case 4:
                                mostrarNombres(nombres_array);
                                break;
                        }
                    }   
                    break;
                //MENU OBJETOS CIRCULO
                case 3:
                    while(opcion != 0){
                        opcion = menuCirculos();
                        switch(opcion){
                            //Añadir
                            case 1:
                                circulos_array[cajonActualCirculos] = new Circulo();
                                cajonActualCirculos += 1;
                                break;
                            //Mostrar
                            case 2:
                                mostrarCirculos(circulos_array);
                                break;
                        }
                    }   
                    break;
                }
                opcion = 5;
            }
        }
    }
}
