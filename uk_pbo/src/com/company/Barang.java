package com.company;

public class Barang {
    private int uang_sekarang ;
    private int _A ,_B , _C , _D , _E ;
    private int hA = 13000, hB = 28000, hC = 35000, hD=51000, hE = 124000;
    public int getUang_sekarang() {
        return uang_sekarang;
    }

    public void setUang_sekarang(int uang_sekarang) {
        this.uang_sekarang = uang_sekarang;
    }

    public void pembeliaBarang(char kd){
        if (kd == 'A'){
            if (uang_sekarang < hA){
                System.out.println("Uang Anda tidak mencukupi");
            }else{
                _A++;
                uang_sekarang -= hA;
            }
        }else if( kd == 'B'){
            if (uang_sekarang < hB){
                System.out.println("Uang Anda tidak mencukupi");
            }else{
                _B++;
                uang_sekarang -= hB;
            }
        }else if( kd == 'C'){
            if (uang_sekarang < hC){
                System.out.println("Uang Anda tidak mencukupi");
            }else{
                _C++;
                uang_sekarang -= hC;
            }
        }else if( kd == 'D'){
            if (uang_sekarang < hD){
                System.out.println("Uang Anda tidak mencukupi");
            }else{
                _D++;
                uang_sekarang -= hD;
            }
        }else if( kd == 'E'){
            if (uang_sekarang < hE){
                System.out.println("Uang Anda tidak mencukupi");
            }else{
                _E++;
                uang_sekarang -= hE;
            }
        }
        if (_A > 0) System.out.println( _A + " Barang A");
        if (_B > 0) System.out.println( _B + " Barang B");
        if (_C > 0) System.out.println( _C + " Barang C");
        if (_D > 0) System.out.println( _D + " Barang D");
        if (_E > 0) System.out.println( _E + " Barang E");
    }

    public void strukPembelian(){
        int totalBelanja = _A * hA + _B * hB + _C * hC + _D * hD + _E * hE;
        System.out.println("\n\n+===================+");
        System.out.println("\tStruk Pembelian Barang");
        if (_A > 0) System.out.println( _A + " Barang A Rp"+hA); _A = 0;
        if (_B > 0) System.out.println( _B + " Barang B Rp"+hB); _B = 0;
        if (_C > 0) System.out.println( _C + " Barang C Rp"+hC); _C = 0;
        if (_D > 0) System.out.println( _D + " Barang D Rp"+hD); _D = 0;
        if (_E > 0) System.out.println( _E + " Barang E Rp"+hE); _E = 0;
        System.out.println("---------------+");
        System.out.println("Total Belanja Rp" + totalBelanja );
    }
}
