/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latsol1;

/**
 *
 * @author User
 */
public class ACBeraksi extends InterfaceAC{
    

    void matikanAC(){
        System.out.println("AC dimatikan");
    }
    void dinginkanAC() {
        System.out.println("Dinginkan suhu AC");
    }
    void hidupkanAC(){
        System.out.println("AC dihidupkan");
    }
    void panaskanAC() {
        System.out.println("Panaskan suhu AC");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ACBeraksi ac = new ACBeraksi();
        ac.hidupkanAC();
        ac.panaskanAC();
        ac.dinginkanAC();
        ac.matikanAC();
    }
}
