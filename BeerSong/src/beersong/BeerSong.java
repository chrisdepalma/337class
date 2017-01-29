/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Chris
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
    public static void Ninety_Nine_Bottles_of_Beer(){        
        for(int x = 99; x > 0; x--){
            System.out.println(x+" bottles of beer on the wall, "+x+" bottles of beer");
            if (x ==1){
                System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            }else
            System.out.println("take one down, pass it around, "+(x-1)+" bottles of beer on the wall.");            
        }        
    }    
}
