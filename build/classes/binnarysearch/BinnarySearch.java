/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binnarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class BinnarySearch {
public static int med;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Masukkan Banyak Array = 7");    
        int[] Array = new int[8];
        Array[0]=8;
        Array[1]=7;
        Array[2]=3;
        Array[3]=1;
        Array[4]=2;
        Array[5]=5;
        Array[6]=4;
        Array[7]=6;
        
        System.out.println("\n=======================");
        
           System.out.print("\nNilai Pada Array Yang Diinput : ");
           System.out.print(Arrays.toString(Array));

         // Sorting Pada Array
         for (int k = 0 ; k < Array.length ; k++){
             for (int l = k ; l < Array.length ; l++){
                if (Array[k]>Array[l]){
                    int wadah = Array[k];
                    Array[k] = Array[l];
                    Array[l] = wadah;
                }
             }
         }
         System.out.print("\nNilai Pada Array Yang Sudah Disorting : ");
         System.out.println(Arrays.toString(Array));
         
         
        System.out.print("Nilai Yang Dicari : 6");
        int x = 6;
        boolean notFound = true;
       
        System.out.println("\n======== Hasil ========");
        
        int y = 0;
        int lower = 0;
        int upper = Array.length - 1;

        
        //Penentu Median / Nilai tengah 
         if (Array.length % 2 == 1){
             med = (Array.length)/2;
         }
         else {
             med = (Array.length-1)/2;
         }
         
                             //Pencarian Pada Array
                                  if (Array[med] <= x) {
                                  for ( int i = med ; i < Array.length ; i++ ) {
                                      if (Array[i] == x) {
                                         System.out.println("Data Ditemukan pada Array ke-" + i);
                                         y = 1;
                                         }
                                     }
                                  }

                                  if (Array[med] >= x ){
                                      for ( int k = 0 ; k < med ; k++ ) {
                                          if (Array[k] == x) {
                                              System.out.println("Data Ditemukan pada Array ke-" + k);
                                              y = 1;
                                          }
                                    }
                                 }


    }
    
}
