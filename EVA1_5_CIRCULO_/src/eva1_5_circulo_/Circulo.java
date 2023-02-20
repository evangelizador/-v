/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_circulo_;

/**
 *
 * @author Uptow
 */
public class Circulo {
    private double radio;
    private double resul;
    private double resul2;
    private double peri;
    private double area;
    
    public Circulo(){
        radio = 0;
        peri = 0;
        area = 0;
    }
    public Circulo(double radioAr){
        radio = radioAr;
        resul = (3.1416*radioAr*radioAr);
        area = resul;
        resul2 = (3.1416*radioAr*2);
        peri = resul2;
    }
    public double getResul(){
        return area;
    }
    public double getResul2(){
        return peri;
    }
    //area = 3.1416*R^2
    //perimetro = 3.1416*d 
    
}
