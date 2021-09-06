package com.tutorial;

//class sebagai template
class Siswa{
    String nama;
    String jurusan;
}

public class main {

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.nama = "Asep";
        siswa1.jurusan = "RPL";

        System.out.println(siswa1.nama);
        System.out.println(siswa1.jurusan);

        Siswa siswa2 = new Siswa();
        siswa2.nama = "udin";
        siswa2.jurusan = "RPL";

        System.out.println(siswa2.nama);
        System.out.println(siswa2.jurusan);

    }
    
}
