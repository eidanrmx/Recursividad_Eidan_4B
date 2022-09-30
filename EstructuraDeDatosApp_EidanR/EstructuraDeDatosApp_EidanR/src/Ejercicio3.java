/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio3{
public static void main(String[] args) { //iniciamos la funcion main
int[] array={1,2,3,4,5}; //Creamos un array
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza
}
public static void mostrarArrayRecursivo(int[] array, int indice){
/*1º forma*/
/*
if (indice == (array.length-1)){
System.out.println(array[indice]);
}else{
System.out.println(array[indice]);
mostrarArrayRecursivo(array, indice+1);
}
*/
/*2º forma*/
if (indice != array.length){//Mostramos el valor en ese indice
System.out.println(array[indice]);//Llamamos recursivamente a la función
mostrarArrayRecursivo(array, indice+1);//utilizar la funcion mostrarArrayRecirsivo
}
}
}
