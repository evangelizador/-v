/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author Uptow
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("circulo = " + calculararea(5.0) );
        System.out.println("triangulo = " + calculararea(5.0, 5.0));
        System.out.println("trapesio = " + calculararea(5.0, 5.0, 5.0));
    }
    
    
    
    public static double calculararea(double radio){
        return (radio*radio) * Math.PI;
    }
    public static double calculararea(double base, double altura){
        return (base * altura)/2.0;   
    }
    public static double calculararea(double altura, double baseMe,double baseMa){
        return (altura * (baseMa * baseMe))/2.0;  
    } 
}
