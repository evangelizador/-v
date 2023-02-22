/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_return;

/**
 *
 * @author Uptow
 */
public class EVA1_10_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //:v
        // TODO code application logic here
        square(15);//llamada funcion, pero sin procesar el resultado 
        int resu;
        resu = square(3); //llamada a funcion, almacenando el resultado 
        System.out.println(resu);
        System.out.println(square(5));//llamada a funcion, enviando el resultado 
    }
    
    public static int square(int num){
        return num * num;
    }
}
