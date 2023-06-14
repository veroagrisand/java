/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Veroagrisand
 */
//INHERITANCE DENGAN KATA EXTENDS
public class Sepedagunung extends Sepeda{
    
    private int sadel;
    //MUTATOR
    void  setSadel(int jumlah){
        sadel=getGir()- jumlah;
    }
    //ACCESSOR
    int getSadel(){
        return sadel;
    }
}
