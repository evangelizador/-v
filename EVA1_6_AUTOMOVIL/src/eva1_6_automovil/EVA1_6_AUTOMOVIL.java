/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author Uptow
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto auto1 = new Auto("oni-san", "UwU", "nia", 2000, "Chocola");
        //:v
        System.out.println("Datos del auto:");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Placas: " + auto1.getPlacas());
        System.out.println("Año: " + auto1.getAño());
        System.out.println("Dueño: " + auto1.getDueño());
        System.out.println("Adeudo: " + auto1.getAdeudo());
        //:v
    }
    
}
