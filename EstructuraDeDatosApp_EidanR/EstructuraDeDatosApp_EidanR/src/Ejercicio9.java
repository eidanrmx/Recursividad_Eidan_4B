/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio9  {
public static void main(String[] args) { //iniciar metodo main
int base = 10; //establecer variables
int exponente = -2;
System.out.println(potencia(base, exponente));//imprimir respuesta del metodo
}
public static double potencia(int base, int exponente) {//iniciar metodo potencia
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);//dar la respuesta del metodo para despues poder imprimir
}
}
}
