/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latsol1;

/**
 *
 * @author User
 */
public class Bank {
    
    int saldoSaya;
    int total;
    Bank(int saldo){
        saldoSaya = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat datang di Bank BNN");
        System.out.println("Saldo saat ini : Rp." + saldoSaya);
        
    }
    void simpanUang(int simpan){
        total = simpan + saldoSaya;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + simpan);
    }
    void ambilUang(int ambil){
        int total2 = total - ambil;
        System.out.println("Ambil uang : " + ambil);
        System.out.println("saldo saat ini : Rp." + total2);
    }
}
