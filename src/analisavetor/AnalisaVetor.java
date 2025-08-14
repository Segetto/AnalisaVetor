/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisavetor;

/**
 *
 * @author Admin
 */
public class AnalisaVetor {
    public static void AnalisaVetor(int[] vetor){
        for(int i : vetor){
            if(i%2 == 1){
                System.out.println("O número " + i + " é impar");
            }else if(i%10 == 0){
                System.out.println("O número " + i + " é par e múltiplo de 10");
            }
        }
    }
}
