/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Ejercicio8 {
public static void main(String[] args) {//inicar metodo main
String palabra = "Hola";//establecer variable
System.out.println(invertirPalabra(palabra, palabra.length()-1));//imprimir palabra usando el metodo
}
public static String invertirPalabra(String palabra, int longitud){//iniciar metodo invertirpalabra
if(longitud==0){
//verifica si la palabra introducida no esta vacio
return palabra.charAt(longitud)+"";
}else{
//regresar y repetir si necesario para imprimir la palabra inversa
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}
