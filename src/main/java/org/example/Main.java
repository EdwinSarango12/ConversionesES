package org.example;
public class Main {
    public static void main(String[] args) {
        /*int numeroEntero= 42;
        double numeroDouble = numeroEntero;
        System.out.println(numeroDouble);


        long numeroLong = numeroEntero;
        System.out.println(numeroLong);

        float numeroFloat = numeroEntero;
        System.out.println(numeroFloat);

        char letra = 'A';
        int codigoAscii = letra;  //lo convierte en codigo Ascii
        System.out.println(codigoAscii); // imprime: 65*/

        double numeroDecimal2=9.99;
        int numeroEntero2= (int) numeroDecimal2; // Conversion explicita de double a int
        System.out.println(numeroEntero2);

        long numeroLargo3= 100000L;
        int numeroEntero3= (int) numeroLargo3;  // Conversion explicita de long a int
        System.out.println(numeroEntero3);

        String texto= "123";
        int numero= Integer.parseInt(texto);  //Conversion de string a int utilizando un metodo
        System.out.println(numero);

        double valorDecimal=123.456;
        int valorEntero= (int) valorDecimal; // pierde la parte decimal
        System.out.println(valorEntero);





    }
}