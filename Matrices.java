package com.mycompany.matrices;

import java.util.Scanner;
/**
 *
 * @author Carlos Eduardo Wydler Morales 
 */
public class Matrices {
    
    //ATRIBUTOS
    //public static int matriz1[][];
    
    
    //METODOS
    public static void sumaDeMatrices(int matriz1[][], int matriz2[][], int filas, int columnas){
        int i,j;
        int matrizNueva[][] = new int[filas][columnas];
        //SUMAR
        for(i=0; i<filas; i++){
            for(j=0; j<columnas; j++){
                matrizNueva[i][j] = (matriz1[i][j] + matriz2[i][j]);
            }
        }
        //IMPRIMIR
        for(i=0; i<filas; i++){
            for(j=0; j<columnas; j++){
                System.out.println("Valor " + i + " " + j + ": " + matrizNueva[i][j]);
            }
        }
    }
    
    public static void numeroMayorEnMatriz(int matriz[][], int filas, int columnas){
        int i, j, numMayor;
        numMayor = matriz[0][0];
        for(i=0; i<filas; i++){
            for(j=0; j<columnas; j++){
                if(numMayor < matriz[i][j]){
                    numMayor = matriz[i][j];
                }
            }
        }
        
        System.out.println("Numero mayor: " + numMayor);
    }
    
    public static void matrizTranspuesta(int matriz[][], int filas, int columnas){
        int i, j;
        int matrizTranspuesta[][] = new int[columnas][filas];
        for(i=0; i<filas; i++){
            for(j=0; j<columnas; j++){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        
        for(i=0; i<columnas; i++){
            for(j=0; j<filas; j++){
                System.out.println("Valor " + i + " " + j + ": " + matrizTranspuesta[i][j]);
            }
        }
    }
    
    public static void sumaDiagonalMatriz(int matriz[][], int filas, int columnas){
        int i=0, suma=0;
        while(i<filas){
            suma = suma + matriz[i][i];
            i++;
        }
        
        System.out.println("Suma diagonal: " + suma);
    }

    public static void MultiplicacionMatriz(){
        int n, m, i, j, k;
        int A[][] = new int[][];
        int B[][] = new int[][];
        int C[][] = new int[][];
        System.out.println("Ingrese dimension n:");
        n = leer.nextInt();
        System.out.print("Ingrese dimension m: ");
        m = leer.nextInt();

        System.out.println("INGRESE VALORES MATRIZ A");
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= m; j++) {
                System.out.print("A[" + (i) + "," + (j) + "]= ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese valores Matriz B:");
        for(i=0; i<= n; i++){
            for(j = 0; i<= m; j++){
                System.out.println("A[" + (i) + "," + (j) + "]= ");
            }
        }
        System.out.println("INGRESE VALORES MATRIZ B");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("B[" + (i) + "," + (j) + "]= ");
                B[i][j] = leer.nextInt();
            }
        }
        // Imprimiendo Matrices A y B
        System.out.println("======== MATRIZ A =========");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println();
        }
        System.out.println("====== MATRIZ B ========");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("\t" + B[i][j]);
            }
            System.out.println();
        }
        // Multiplicación de matrices A*B = C
         for(i = 0; i<= n; i++){
            for(j = 0; j<= m; j++){
                for(i=0; i<=n; i++){
                    for(j = 0; j<=n; j++){
                        C[i][j] = 0;
                        for(k = 0; k<=n; k++){
                            C[i][j] = (C[i][j]+ (A[i][k] * B[k][j]));
                        }
                    }
                }
            }
         }
         System.out.println("======================= MATRIZ MULTIPLICADA ============");
         System.out.println("======================= IMPRIMIENDO LA MATRIZ C =======");
         for(i=0; i <= n; i++){
            for(j=0; j=< m; j++){
                System.out.print("\n"+ C[i][j]);
            }
         }
         System.out.println();
    }

    public static void MatrizMultiplicarEscalar(int matriz [][], eMatriz, int escalar) {
        for(int i =0; i< eMatriz.length; i++){
            for(int j=0; j< eMatriz[i].length; j++){
                eMatriz[i][j] * = escalar;
            }
        }
    }
    public static void inicializar(int matriz[][] eMatriz){
        for(int i = 0; <eMatriz.length; i++){
            for(int j =0; eMatriz[i].length; j++){
                eMatriz[i][j] = (int)(Math.random()* 10) + 1;
            }
        }
    }
    public static void visualizar(int matriz [][] eMatriz){
        for(int i=0; i<eMatriz.length; i++){
            for(int j =0; j<eMatriz[i].length; j++){
                System.out.print("\n" + eMatriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        int filas, columnas;
        System.out.println("Cuantas filas: ");
        filas = input.nextInt();
        System.out.println("Cuantas columnas: ");
        columnas = input.nextInt();
        int matriz1[][] = new int[filas][columnas];
        int matriz2[][] = new int[filas][columnas];
        int i, j;
        //Matriz 1
        for(i=0; i<filas; i++){
            for(j=0; j<columnas; j++){
                System.out.println("Valor " + i + " " + j + ":");
                matriz1[i][j] = input.nextInt();
            }
        }
        Scanner input = new Scanner(System.in)
        int matriz [][] = new int[][];
        inicializar(matriz);
        System.out.println("Matriz original");
        visualizar(matriz);
        sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("\nMatriz multiplicada por el escalar " + num);
        MatrizMltiplicarEscalar(matriz, num);
        visualizar(matriz);
        //Matriz 2
//        for(i=0; i<filas; i++){
//            for(j=0; j<columnas; j++){
//                System.out.println("Valor " + i + " " + j + ":");
//                matriz2[i][j] = input.nextInt();
//            }
//        }
        
        //sumaDeMatrices(matriz1, matriz2, filas, columnas);
        //numeroMayorEnMatriz(matriz1, filas, columnas);
        //sumaDiagonalMatriz(matriz2, filas, columnas);
        matrizTranspuesta(matriz1, filas, columnas);
    }
}
