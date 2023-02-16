package com.mycompany.mystack;

import java.util.Scanner;
/**
 *
 * @author Carlos Eduardo Wydler 173957
 */
public class MyStack {
    //ATRIBUTOS-----------------------------------------------------------------
    //PILA
    public static char stack[] = new char[10];
    public static int top = 0;
    public static int maxP = 10;
    //COLA
    public static int queue[] = new int[10];
    public static int tail = 0;
    public static int maxC = 10;
    
    
    //METODOS-------------------------------------------------------------------
    //PILA--------------------------------------------
    //Extraer elemento al final de la pila
    public static char pop(){
        char temp;
        int i;
        //Arreglo vacío
        if(top == 0){
            System.out.println("Stack is empty");
            return '#';
        }else{
            temp = stack[top-1];
            top -= 1;
            return temp;
        }
    }
    //Agregar elemento al final de la pila
    public static void push(char data){
        //Arreglo lleno
        if(top == maxP){
            System.out.println("Stack is full");
        }else{
            stack[top] = data;
            top += 1;
        }
    }
    //Mostrar pila
    public static void mostrarPila(){
        int i;
        System.out.println("PILA");
        for(i=0; i<top; i++){
            System.out.print(" " + String.valueOf(stack[i]));
        }
    }
    //COLA--------------------------------------------
    //Insertar valor al final de la cola
    public static void insert(int data){
        if(tail == maxC){
            System.out.println("Queue is full");
        }else{
            queue[tail] = data;
            tail += 1;
        }
    }
    //Eliminar valor al inicio de la cola
    public static int delete(){
        int temp, i;
        if(tail == 0){
            System.out.println("Queue is empty");
            return -1;
        }else{
            temp = queue[0];
            for(i=0; i<(tail-1); i++){
                queue[i] = queue[i+1];
            }
            tail -= 1;
            return temp;
        }
    }
    //Mostrar cola
    public static void mostrarCola(){
        int i;
        System.out.println("COLA");
        for(i=0; i<tail; i++){
            System.out.print(" " + String.valueOf(queue[i]));
        }
    }
    //MENU--------------------------------------------
    public static int menu(){
        int opcion;
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Push en PILA");
        System.out.println("2. POP en PILA");
        System.out.println("3. Mostrar PILA");
        System.out.println("4. Insert en COLA");
        System.out.println("5. Delete en COLA");
        System.out.println("6. Mostrar COLA");
        System.out.println("7. Invertir cadena (PILA)");
        System.out.println("8. Verificador palindromo (PILA)");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    //INVERTIR CADENA---------------------------------
    public static void invertirCadena(char stack2[]){
        int i, j;
        char temp[] = new char[stack2.length];
        for(i=0; i<stack2.length; i++){
            temp[i] = stack2[i];
        }
        for(i=0, j=(top -1); i<top && j>=0; i++, j--){
            stack2[i] = temp[j];
        }
    }
    //VERIFICAR PALINDROMO----------------------------
    public static void verificarPalindromo(char stack2[]){
        int i, j;
        for(i=0, j=(top -1); i<top && j>=0; i++, j--){
            if(stack2[i] != stack2[j]){
                System.out.println("No es palindromo");
                return;
            }
        }
        System.out.println("Es palindromo");
    }
    //MAIN----------------------------------------------------------------------
    public static void main(String[] args) {
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        int opcion = 1;
        char caracter;
        int entero;
        while(opcion != 0){
            System.out.println("");
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Inserte un caracter: ");
                    caracter = input.next().charAt(0);
                    push(caracter);
                    break;
                case 2:
                    caracter = pop();
                    if(caracter != '#'){
                        System.out.println("Caracter eliminado: " + caracter);
                    }
                    break;
                case 3:
                    mostrarPila();
                    break;
                case 4:
                    System.out.println("Inserte un entero: ");
                    entero = input.nextInt();
                    insert(entero);
                    break;
                case 5:
                    entero = delete();
                    if(entero != -1){
                        System.out.println("Caracter eliminado: " + String.valueOf(entero));
                    }
                    break;
                case 6:
                    mostrarCola();
                    break;
                case 7:
                    invertirCadena(stack);
                    mostrarPila();
                    break;
                case 8:
                    verificarPalindromo(stack);
                    break;
            }
        }
    }
}
