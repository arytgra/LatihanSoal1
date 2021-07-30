/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoal1;

/**
 *
 * @author diah_
 */
public class LatihanSoal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sukuPertama = 3;
        int selisih = 5;
        int jumlahSuku = 10;
        int sukuSaatIni = sukuPertama;
        int jumlahDeretAritmatika = 0;
        
        for(int i = 1; i <= jumlahSuku; i++){
            System.out.println("Suku ke -"+i+"adalah "+sukuSaatIni);
            
        jumlahDeretAritmatika += sukuSaatIni;
        
        sukuSaatIni += selisih;
        }
        System.out.println("Jumlah Deret Matematika : "+ jumlahDeretAritmatika);
    }
    
}
