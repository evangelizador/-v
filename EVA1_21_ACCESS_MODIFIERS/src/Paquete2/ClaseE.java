/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;

/**
 *
 * @author Uptow
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void pureba(){
        ClaseA objA = new ClaseA();
        //objA.publicA

        //ClaseD es default, en otro paquete es invisible 
        //ClaseD objD = new ClaseD();
        
    }
}
