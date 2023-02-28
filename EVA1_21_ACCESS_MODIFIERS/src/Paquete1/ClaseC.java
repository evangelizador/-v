/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author Uptow
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    //:v
    
    public void prueba(){
        //TODAS ESTAS CALSES ESTAN EN PAQUETE1 
        //MISMO PAQUETE, PUBLIC Y DEFAULT SON VISIBLES 
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        //CALSES DEL PAQUETE2
        ClaseE objE = new ClaseE();
        //objE.publicE
        
        //ClaseF --> ES DEFAULT, Y NO ES VISIBLE EN OTRO PAQUETE
        //ClaseF objF = new ClaseF();
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
