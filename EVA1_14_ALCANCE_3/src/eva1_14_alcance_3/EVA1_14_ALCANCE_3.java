/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_alcance_3;

/**
 *
 * @author Uptow
 */
public class EVA1_14_ALCANCE_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        System.out.println(x);//visible en todo el main
        for (int i = 0; i < 10; i++) {
            //int x = 100; no se puede, existe en main
            System.out.println(x);//visible en todo el main
            System.out.println(i);
            if (i == 5){
                System.out.println(x);//visible en todo el main
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);            
        }
    }
    public static void Algo(int x) {
        
    }
    public static void Algo2(int x) {
        
    }
}
