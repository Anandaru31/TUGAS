package latsol1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class OverloadMTKBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           MatematikaCanggih mtk = new MatematikaCanggih();
        mtk.pertambahan(12.5, 28.7, 14.2);
        mtk.pengurangan(12.5, 28.7, 14.2);
        mtk.perkalian(12.5, 28.7, 14.2);
        mtk.pembagian(12.5, 28.7, 14.2);
        
        System.out.println("\n");
        mtk.pertambahan(23, 34);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(3.4, 4.9);
    }
    }
    

