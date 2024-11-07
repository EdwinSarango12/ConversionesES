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

        // Seccion byte
        System.out.println("//\t Seccion byte");
        byte numeroByte= 10;
        short numeroShort= (short) numeroByte;
        System.out.println(numeroShort);
        char numeroChar= (char) numeroByte;
        System.out.println(numeroChar);
        int numeroInt= (int) numeroByte;
        System.out.println(numeroInt);
        long numeroLong= (long) numeroByte;
        System.out.println(numeroLong);
        float numeroFloat= (float) numeroByte;
        System.out.println(numeroFloat);
        double numeroDouble= (double) numeroByte;
        System.out.println(numeroDouble);

        // Seccion short
        System.out.println("//\t Seccion short");
        short numeroshort1= 123;
        byte numeroByte1= (byte) numeroShort;
        System.out.println(numeroByte1);
        char numeroChar1= (char) numeroShort;
        System.out.println(numeroChar1);
        int numeroInt1= (int) numeroShort;
        System.out.println(numeroInt1);
        long numeroLong1= (long) numeroShort;
        System.out.println(numeroLong1);
        float numeroFloat1= (float) numeroShort;
        System.out.println(numeroFloat1);
        double numeroDouble1= (double) numeroShort;
        System.out.println(numeroDouble1);

        // Secccion char
        System.out.println("//\t Seccion char");
        char letra= 'S';
        byte letraByte= (byte) letra;
        System.out.println(letraByte);
        short letraShort= (short) letraByte;
        System.out.println(letraShort);
        int letraInt= (int) letraByte;
        System.out.println(letraInt);
        long letraLong1= (long) letraByte;
        System.out.println(letraLong1);
        float letraFloat1= (float) letraByte;
        System.out.println(letraFloat1);
        double letraDouble1= (double) letraByte;
        System.out.println(letraDouble1);

        //Seccion int
        System.out.println("//\t Seccion int");
        int numeroInt12= 12;
        byte numeroByte12= (byte) numeroInt12;
        System.out.println(numeroByte12);
        short numeroShort12= (short) numeroInt12;
        System.out.println(numeroShort12);
        char numeroChar12= (char) numeroInt12;
        System.out.println(numeroChar12);
        long numeroLong12= (long) numeroInt12;
        System.out.println(numeroLong12);
        float numeroFloat12= (float) numeroInt12;
        System.out.println(numeroFloat12);
        double numeroDouble12= (double) numeroInt12;
        System.out.println(numeroDouble12);

        //Seccion long
        System.out.println("//\t Seccion long");
        long numeroLong11=111111;
        byte numeroByte11= (byte) numeroLong11;
        System.out.println(numeroByte11);
        char numeroChar11= (char) numeroLong11;
        System.out.println(numeroChar11);
        int numeroInt11= (int) numeroLong11;
        System.out.println(numeroInt11);
        float numeroFloat11= (float) numeroLong12;
        System.out.println(numeroFloat11);
        double numeroDouble11= (double) numeroLong12;
        System.out.println(numeroDouble11);

        //Seccion float
        System.out.println("//\t Seccion float");
        float numeroFloat2= 22.2F;
        byte numeroByte2= (byte) numeroFloat2;
        System.out.println(numeroByte2);
        short numeroShort2= (short) numeroFloat2;
        System.out.println(numeroShort2);
        char numeroChar2= (char) numeroFloat2;
        System.out.println(numeroChar2);
        int numeroInt2= (int) numeroFloat2;
        System.out.println(numeroInt2);
        long numeroLong2= (long) numeroFloat2;
        System.out.println(numeroLong2);
        double numeroDouble2= (double) numeroFloat2;
        System.out.println(numeroDouble2);

        //Seccion double
        System.out.println("//\t Seccion double");
        double numeroDouble13=13.13;
        byte numeroByte13= (byte) numeroDouble13;
        System.out.println(numeroByte13);
        short numeroShort13= (short) numeroDouble13;
        System.out.println(numeroShort13);
        char numeroChar13= (char) numeroDouble13;
        System.out.println(numeroChar13);
        int numeroInt13= (int) numeroDouble13;
        System.out.println(numeroInt13);
        long numeroLong13= (long) numeroDouble13;
        System.out.println(numeroLong13);
        float numeroFloat13= (float) numeroDouble13;
        System.out.println(numeroFloat13);












    }
}