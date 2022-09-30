/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio10 {
public static void main(String[] args) {//declarar el metodo main
int numero = 123; //declarar una variable
System.out.println(sumaDigitos(numero)); //imprimir lo que tenga numero despues de la funcion
}
public static int sumaDigitos(int numero){//declarar el metodo sumaDigitos
if(numero < 10){ //caso base
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //Cojo el digito y llamo a la funcion
}
}
}
