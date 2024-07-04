package com.latihan;

public class Main {
    
    public static void main (String[] args){

        /* 
        * Type data primitive (Type data yang bersifat static, sudah ditentukan besarannya dalam memory) dalam java :
        *    - Integer = Nilai Satuan
        *    - Byte = Nilai Satuan
        *    - Short = Nilai Satuan
        *    - Long = Nilai Satuan
        *    - Double = Nilai dengan koma atau bilangan real
        *    - Float = Nilai dengan koma atau bilangan real
        *    - Char = Karakter
        *    - Boolean = Nilai True/False, True = 1, False = 0
        */

        System.out.println("===== Integer =====");
        int i; // deklarasi variabel
        i = 10; // assignment
        System.out.println("Nilai integer i = " +i);
        System.out.println("Nilai Maximum = " + Integer.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Integer.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar integer = " + Integer.BYTES + " bytes"); // mencari besaran integer dalam memory (dalam bentuk bytes)
        System.out.println("Besar integer = " + Integer.SIZE + " bit"); // mencari besaran integer dalam memory (dalam bentuk bit)

        System.out.println("===== Byte =====");
        byte b; // deklarasi variabel
        b = 10; // assignment
        System.out.println("Nilai byte b = " +b);
        System.out.println("Nilai Maximum = " + Byte.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Byte.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar byte = " + Byte.BYTES + " bytes"); // mencari besaran byte dalam memory (dalam bentuk bytes)
        System.out.println("Besar byte = " + Byte.SIZE + " bit"); // mencari besaran byte dalam memory (dalam bentuk bit)

        System.out.println("===== Short =====");
        short s; // deklarasi variabel
        s = 10; // assignment
        System.out.println("Nilai short s = " +s);
        System.out.println("Nilai Maximum = " + Short.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Short.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar short = " + Short.BYTES + " bytes"); // mencari besaran short dalam memory (dalam bentuk bytes)
        System.out.println("Besar short = " + Short.SIZE + " bit"); // mencari besaran short dalam memory (dalam bentuk bit)

        System.out.println("===== Long =====");
        long l; // deklarasi variabel
        l = 10L; // assignment (L dibelakang 10, adalah tanda bahwa 10 adalah nilai yang disimpan dalam variabel dengan type long)
        System.out.println("Nilai long l = " +l);
        System.out.println("Nilai Maximum = " + Long.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Long.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar long = " + Long.BYTES + " bytes"); // mencari besaran long dalam memory (dalam bentuk bytes)
        System.out.println("Besar long = " + Long.SIZE + " bit"); // mencari besaran long dalam memory (dalam bentuk bit)

        System.out.println("===== Double =====");
        double dbl; // deklarasi variabel
        dbl = 10.7d; // assignment (d dibelakang 10,7, adalah tanda bahwa 10,7 adalah nilai yang disimpan dalam variabel dengan type double)
        System.out.println("Nilai double dbl = " + dbl);
        System.out.println("Nilai Maximum = " + Double.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Double.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar double = " + Double.BYTES + " bytes"); // mencari besaran double dalam memory (dalam bentuk bytes)
        System.out.println("Besar double = " + Double.SIZE + " bit"); // mencari besaran double dalam memory (dalam bentuk bit)

        System.out.println("===== Float =====");
        float f; // deklarasi variabel
        f = 9.7f; // assignment (d dibelakang 9,7, adalah tanda bahwa 9,7 adalah nilai yang disimpan dalam variabel dengan type double)
        System.out.println("Nilai float f = " + f);
        System.out.println("Nilai Maximum = " + Float.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Float.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar float = " + Float.BYTES + " bytes"); // mencari besaran float dalam memory (dalam bentuk bytes)
        System.out.println("Besar float = " + Float.SIZE + " bit"); // mencari besaran float dalam memory (dalam bentuk bit)

        System.out.println("===== Char =====");
        char c; // deklarasi variabel
        c = 'c'; // assignment
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai Maximum = " + Character.MAX_VALUE); // mencari nilai maksimum
        System.out.println("Nilai Minimum = " + Character.MIN_VALUE); // mencari nilai minimum
        System.out.println("Besar char = " + Character.BYTES + " bytes"); // mencari besaran char dalam memory (dalam bentuk bytes)
        System.out.println("Besar char = " + Character.SIZE + " bit"); // mencari besaran char dalam memory (dalam bentuk bit)

        System.out.println("===== Boolean =====");
        boolean bool; // deklarasi variabel
        bool = true; // assignment
        System.out.println("Nilai boolean bool = " + bool);
        System.out.println("Nilai Maximum = " + Boolean.TRUE);
        System.out.println("Nilai Minimum = " + Boolean.FALSE);
        
        
        /* 
        *   Sebagai catatan :
        *       - Untuk boolean tidak memiliki nilai maksimum & minimum karena hanya bernilai True / False 
        *       - Besaran nilai boolean hanya bernilai 1 bit
        *       - String tidak termasuk type data primitive, tapi termasuk kedalam type data high level yang mana string bersifat Dinamis. String bernilai kumpulan karakter (char)
        */

    }

}
