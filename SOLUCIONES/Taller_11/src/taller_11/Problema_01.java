/*
Generar los procedimientos y/o funciones que impriman los valor pares, impares 
y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s)
deben ser invocados desde el método principal (quien es el único responsable de 
gestionar las entradas/salidas); además el método debe recibir como parámetro un
arreglo bidimensional.
 */
package taller_11;
/**
 * @author Juan Diego Guerrero Camargo
 */
public class Problema_01 {
    public static void main(String[] args) {
        int limF = 3, limC = 3;
        int matriz1[][] = new int [limF][limC];
        int matriz2[][] = new int [limF][limC];
        int matriz3[][] = new int [limF][limC];
        generarMatriz(matriz1, limF, limC);
        System.out.println("Matriz 1");
        System.out.println(devolverMatriz(matriz1, limF, limC));
        paresMatriz(matriz1, matriz2, limF, limC);
        System.out.println("Pares Matriz:");
        System.out.println(devolverMatriz(matriz2, limF, limC));
        imparesMatriz(matriz1, matriz3, limF, limC);
        System.out.println("Impares Matriz:");
        System.out.println(devolverMatriz(matriz3, limF, limC));
        System.out.println("El promedio de la matriz es: " + promedio(matriz1, limF, limC));
    }
    public static void generarMatriz(int matriz[][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
            }
        }
    }
    
    public static String devolverMatriz(int matriz[][], int limF, int limC){
        String cadena = "";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                cadena += String.format("%d\t", matriz[ i][j]); 
            }
            cadena += "\n";
        }
        return cadena;
    }
    public static void paresMatriz(int matriz1[][], int matriz2[][], int limF, int limC){
           for (int i = 0; i < limF; i++) {
               for (int j = 0; j < limC; j++) {
                   if ((matriz1[i][j]%2) == 0) {
                       matriz2[i][j] = matriz1[i][j];
                   }else{
                       matriz2[i][j] = 0;
               }
               }
            }
        }
        public static void imparesMatriz(int matriz1[][], int matriz3[][], int limF, int limC){
           for (int i = 0; i < limF; i++) {
               for (int j = 0; j < limC; j++) {
                   if ((matriz1[i][j]%2)!=0) {
                       matriz3[i][j] = matriz1[i][j];
                   }else{
                       matriz3[i][j] = 0;
               }
               }
            }
        }
    
        public static double promedio(int matriz1[][], int limF, int limC){
            double promedio = 0;
            for (int i = 0; i < limF; i++) {
                for (int j = 0; j < limC; j++) {
                    promedio += matriz1[i][j];
                }
            }
        promedio = promedio/(limF*limC);
        return promedio;
        }
}

    

