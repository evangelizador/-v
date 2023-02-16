/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_television;

/**
 *
 * @author Uptow ñ
 */
public class Television {
    //atributos: estado
    private boolean power;
    private int volumen;
    private int canal;
    //métodos: comportamiento
    //constructor:
    public Television(){//constructor default 
        power = false; //apagada :v
        volumen = 10;
        canal = 4;
    }
    public void cambiarPower(){
        if (power == false){ // apagado 
            power = true; // encendemos la TV
            System.out.println("TELEVICION ENSENDIDA");
          }
           else{
            power = false;
            System.out.println("TELEVICION APAGADA");
           }
        }
    public void subirVolumen(){
        if (power == true){
            if(volumen < 100){
                volumen = volumen + 5;
                System.out.println("Volumen: " + volumen);
            }
        }
        
    }
    public void bajarVolumen(){
        if (power == true){
            if (volumen > 0){
                volumen = volumen - 5;
                System.out.println("Volumen: " + volumen);
            }
            
        }
    }
    public void subirCanal(){
        if (power == true){
            if(canal < 100){
                canal = canal + 1;
            }else
                canal = 0;
                System.out.println("canal: "+ canal);
            
        }
    }
    public void bajarCanal(){
        if ( power == true){
            if (canal > 0){
                canal = canal - 1;
            }else
                canal = 100;
                System.out.println("Canal: " + canal);
            
        }
        
    }
}
