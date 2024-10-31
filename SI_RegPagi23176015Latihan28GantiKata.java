/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176015.latihan28.gantikata;

/**
 *
 * @author Asus
 * NAMA     : Natasya Adillah
 * KELAS    : PBO 06
 * NIM      : 23176015
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menggantikan kata 
 * tertentu dalam suatu kalimat dengan kata baru yang diinginkan.
 */
import java.util.Scanner;
public class SI_RegPagi23176015Latihan28GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata : ");
        String kataGanti = input.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();

        // Mengganti kata yang diminta dengan kata baru
        String kalimatBaru = kalimat.replace(kataGanti, kataBaru);

        // Menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

        input.close();
    }
}
