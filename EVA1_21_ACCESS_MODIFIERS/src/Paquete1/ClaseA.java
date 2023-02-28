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
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        //TODAS ESTAS CALSES ESTAN EN PAQUETE1 
        //MISMO PAQUETE, PUBLIC Y DEFAULT SON VISIBLES 
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        //CALSES DEL PAQUETE2
        //TODO LO QUE SEA DEFAULT ES AHORA INVISIBLE
        ClaseE objE = new ClaseE();
        //objE.publicE
        
        //ClaseF --> ES DEFAULT, Y NO ES VISIBLE EN OTRO PAQUETE
        //ClaseF objF = new ClaseF();

    }
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
    
}
