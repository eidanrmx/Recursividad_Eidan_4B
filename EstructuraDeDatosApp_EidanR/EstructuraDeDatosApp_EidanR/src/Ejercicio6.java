/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio6{
public static void main(String[] args) {//iniciar metodo main
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
int posicion = 5; //establecer variable
int resultado = fibonacciRecursivo(posicion);
System.out.println(resultado); //imprimir resultado
}
public static int fibonacciRecursivo(int n) {
//CASO BASE, si es cero devuelve un cero
//Puedes poner n<=0 tamvien para incluir negativos
if (n == 0){
return 0;
//CASO BASE, si es 1 devuelve un 1
} else if (n == 1) {
return 1;
} else {
//Hago la suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
}
}
