/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio5{
public static void main(String[] args) { //iniciar metodo main
int[][] m = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
//llamada inicial
recorrerMatrizRecursivo(m, 0, 0); //usar el metodo recorrerMatrizRecursivo
}
public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
//Muestro el numero (sin salto de linea)
System.out.print(m[i][j] + " ");
//
if (i != m.length - 1 || j != m[i].length - 1) {
//Indico si llego al final de la fila
if (j == m[i].length - 1) {
//Paso a la siguiente fila
i++;
//Reinicio la j
j = 0;
//Salto de linea (solo formato)
System.out.println("");
} else {
//Paso a la siguiente columna
j++;
}
//Volvemos a llamar la función recursivamente
recorrerMatrizRecursivo(m, i, j);
}
}
}
