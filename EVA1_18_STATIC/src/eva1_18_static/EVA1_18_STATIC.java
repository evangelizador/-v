/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_static;

/**
 *
 * @author Uptow
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("PI" + Math.PI);
        
    }
    
}
class Prueba{
  public void mensaje(){//solo al crear objetos 
      System.out.println("Hola!!!");
  }
  public static void mensajeEstatico(){//directamente de la clase
      System.out.println("Hola!!!(estatico)");
  }
}
class otra{
    
}