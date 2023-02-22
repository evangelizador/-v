/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_califas;

/**
 *
 * @author Uptow
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ev(81));
    }
    public static String ev(int num){
        String resu;
        if (num >= 91) {
            resu = "A";
            
        } else if (num >= 81) {
            resu = "B";
            
        } else if (num >= 71) {
           resu = "C";
            
        } else {
            resu ="D";
        }
        return resu;
    }
    //:V
    //;v
    
}
