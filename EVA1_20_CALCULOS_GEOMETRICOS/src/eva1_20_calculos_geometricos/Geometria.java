/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author Uptow
 */
public class Geometria {
    //constantes:
    public static final double PI = 3.1416;
    
    // perímetro de un circulo 
    public static double perimetrocirculo(double radio){
        return PI * (radio * 2);
    }
    //área de un circulo
    public static double areacirculo(double radio){
        return PI * (radio * radio);   
    }
    // volumen de una esfera
    public static double volumenEsfera(double radio){
        return (4.0 / 3.0) * (PI* (radio* radio* radio));
    }
}
