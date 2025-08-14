/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisavetor;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CarregaVetor {

    public static void CarregaVetor() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor");
        boolean v = false;
        int t = 0;
        while (!v) {
            t = ler.nextInt();
            v = t > 0 && t <= 100;
        }
        int[] vetor = new int[t];
        for(int i = 0; i < t; i++){
            System.out.println("Insira o valor");
            vetor[i] = ler.nextInt();
        }
        AnalisaVetor.AnalisaVetor(vetor);
    }
}
