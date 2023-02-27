/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static_2;

/**
 *
 * @author Uptow
 */
public class EVA1_19_STATIC_2 {
    int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //System.out.println(x);
       //mensajeNoEstatico();
       EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
       System.out.println(obj.x);
       obj.mensajeNoEstatico();
       // AHORA MENSAJE ESTATICO
       mensajeEstatico();
    }
    public void mensajeNoEstatico(){//NO EXISTE
        System.out.println("MENSAJE NO ESTATICO");
    }
    public static void mensajeEstatico(){//EXISTE AL INICIAR EL PROGRAMA
        System.out.println("MENSAJE ESTATICO");
    }
    
}
