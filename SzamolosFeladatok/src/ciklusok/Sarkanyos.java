/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciklusok;

/**
 *
 * @author User
 */
public class Sarkanyos {
    public static void main(String[] args) {
        for (int j = 1; j < Math.floor(145 / 11); j++) {
            for (int i = 1; i < Math.floor(145 / 7); i++) {
                if (7 * i + 11 * j == 145) {
                    System.out.println("hét fejűek: " + i + " \ntizenegy fejűek: " + j);
                }
            }
        }
    }
}
