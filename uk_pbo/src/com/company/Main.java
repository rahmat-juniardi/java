package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Pecahankoin human = new Pecahankoin();
        Barang Obj = new Barang();

        int pilihInt;
        char pilihChar;
        int nominal;
        boolean running = true;
        while(running) {
            System.out.println("\tNama Barang");
            System.out.println("1). Barang A - Rp13000\n2). Barang B - Rp28000\n3). Barang C - Rp35000\n4). Barang D - Rp51000\n5). Barang E - Rp124000");
            System.out.println("\tCashire Mechine");
            System.out.println("Uang anda : Rp" + human.getUang_sekarang());
            System.out.print("1). Masukan Uang\n2). Beli Barang\n3). Kembalian/Tukar Pecah\nPilih [1-3] : ");
            pilihInt = keyboard.nextInt();
            switch (pilihInt) {
                case 1:
                    do {
                        System.out.println("Nominal : Rp1000 - Rp2000 - Rp5000 - Rp10000 - Rp50000 - Rp100000");
                        nominal = keyboard.nextInt();
                        human.setNominal(nominal);
                        System.out.println("Uang anda : Rp" + human.getUang_sekarang());
                        System.out.print("Tambah lagi? [y/n] : ");
                            pilihChar = keyboard.next().charAt(0);
                    } while (pilihChar == 'y');
                    break;
                case 2:
                    do {
                        System.out.print("Pilih nama barang [A-E] : ");
                            pilihChar = keyboard.next().charAt(0);
                        Obj.setUang_sekarang(human.getUang_sekarang());
                        Obj.pembeliaBarang(pilihChar);
                        human.setUang_sekarang(Obj.getUang_sekarang());
                        System.out.println("Uang anda : Rp" + human.getUang_sekarang());
                        System.out.print("\nBelanja Lagi?? [y/n] : ");
                            pilihChar = keyboard.next().charAt(0);
                    }while (pilihChar == 'y');
                    break;
                case 3:
                        Obj.strukPembelian();
                        human.ambilKembalian();
                        System.out.print("\nBelanja Lagi?? [y/n] : ");
                            pilihChar = keyboard.next().charAt(0);
                        if (pilihChar == 'n') {
                            System.out.println("Terimakasih Sudah Berbelanja");
                            System.exit(0);
                        }
                    break;
            }
        }
    }
}
