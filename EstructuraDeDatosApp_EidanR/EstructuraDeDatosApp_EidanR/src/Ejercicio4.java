/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio4{
public static void main(String[] args) { //iniciar metodo main
int[] array={1,2,3,4,5}; //establecer arreglo
int elementoBuscar=3; //establecer variable
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);//empezar usar el metodo
System.out.println(posElementoEncontrado); //imprimir resultado de el metodo anterior
}
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){//empezar metodo
if(indice==array.length || array[indice]==elementoBuscar){//verificar si indice es igual a la cantidad de caracteres que tiene o si tiene un cierto caracter
if(indice==array.length){ //solamente verificar si es la cantidad del arreglo
return -1;
}else{
return indice; //regresar el indice
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1); //dar la respuesta del metodo
}
}
}
