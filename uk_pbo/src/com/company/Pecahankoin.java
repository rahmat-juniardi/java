package com.company;

import com.sun.security.jgss.GSSUtil;

public class Pecahankoin {
    private int uang_sekarang;
    private int nominal;
    private int _1rb,_2rb,_5rb,_10rb,_20rb,_50rb;

    public void setNominal(int nominal) {
        this.nominal = nominal;
        uang_sekarang += nominal;
    }

    public int getUang_sekarang() {
        return uang_sekarang;
    }

    public void setUang_sekarang(int uang_sekarang) {
        this.uang_sekarang = uang_sekarang;
    }

    public void ambilKembalian(){
        System.out.println("+===================+");
        System.out.println("\tKembalian");
        System.out.println("Uang Anda : " + uang_sekarang);
        while(uang_sekarang>50000){
            _50rb++;
            uang_sekarang -= 50000;
        }
        while(uang_sekarang>20000){
            _20rb++;
            uang_sekarang -= 20000;
        }
        while(uang_sekarang>10000){
            _10rb++;
            uang_sekarang -= 10000;
        }
        while(uang_sekarang>5000){
            _5rb++;
            uang_sekarang -= 5000;
        }
        while(uang_sekarang>2000){
            _2rb++;
            uang_sekarang -= 2000;
        }
        while(uang_sekarang>=1000){
            _1rb++;
            uang_sekarang -= 1000;
        }
        if (_50rb > 0) System.out.println( _50rb + " lembar Rp50000");_50rb = 0;
        if (_20rb > 0) System.out.println( _20rb + " lembar Rp20000");_20rb = 0;
        if (_10rb > 0) System.out.println( _10rb + " lembar Rp10000");_10rb = 0;
        if (_5rb > 0) System.out.println( _5rb + " lembar Rp5000");_5rb = 0;
        if (_2rb > 0) System.out.println( _2rb + " lembar Rp2000");_2rb = 0;
        if (_1rb > 0) System.out.println( _1rb + " lembar Rp1000");_1rb = 0;
        System.out.println("+===================+");
    }
}
