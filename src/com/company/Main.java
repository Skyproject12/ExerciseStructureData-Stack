package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String nama;
	String nim;
	int pilih;
	inputan lanjut;
	do {
        link<inputan> bantu = new link();
        System.out.println("====Biodata diri=======");
        System.out.println("1. input data");
        System.out.println("2. hapus data");
        System.out.println("3. tampilkan data");
        System.out.println("4. exit");
        pilih = scan.nextInt();
        if (pilih == 1) {
            lanjut=new inputan();
            System.out.println("masukkan nama");
            nama=scan.next ();
            System.out.println("masukkan nim");
            nim=scan.next();

            lanjut.setNama(nama);
            lanjut.setNim(nim);
            bantu.insertdepan(lanjut);

        }
        if(pilih==2){
            System.out.println("hapus data");
            bantu.hapusdepan();
        }
        if(pilih==3){
            System.out.println("data");
            bantu.view();
        }
    }while(pilih!=4);
        System.out.println("terima kasih telah menonton untuk dosen tolong apresiasi dan " +
                "untuk penonton jangan lupa suscreabe channel saya endles code ");
    }
}
