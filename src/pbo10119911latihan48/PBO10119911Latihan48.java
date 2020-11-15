/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911latihan48;

/**
 *
 * @author 
 * Nama : Mochamad Tegar
 * NIM : 10119911
 * Kelas : IF 10K
 */
public class PBO10119911Latihan48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator hitung = new Kalkulator();
        
        System.err.println("value1 = 7.0 ");
        hitung.setValue1(7.0);
        System.out.println("value2 = 5.0");
        hitung.setValue2(5.0);
        System.out.println("");
        hitung.setNamaProject();
        System.out.println("");
        hitung.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = " + hitung.add(7.0, 5.0));
        System.out.println("Result minus is = " + hitung.minus(7.0, 5.0));
        System.out.println("Result multiple is = " + hitung.minus(7.0, 5.0));
        System.out.println("Result division id = " + hitung.division(7.0,5.0));
    }
    
}
