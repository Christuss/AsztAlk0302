/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciklusok;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Szamok {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Legyen ismétlés?");
        String bekeres = sc.nextLine();
        int darab = 0;
        if (bekeres.contains("igen")) {
            for (int k = 2; k < 5; k++) {
                for (int i = 2; i < 5; i++) {
                    for (int j = 2; j < 5; j++) {
                        System.out.println(k + "" + i + "" + j);
                        darab++;
                    }
                }
            }
        } else if (bekeres.contains("nem")) {
            for (int k = 2; k < 5; k++) {
                for (int i = 2; i < 5; i++) {
                    for (int j = 2; j < 5; j++) {
                        if (k != i && i != j && k != j) {
                            System.out.println(k + "" + i + "" + j);
                            darab++;
                        }

                    }
                }
            }
        }
        System.out.println("Darab: " + darab);

        for (int j = 1; j < Math.floor(145 / 11); j++) {
            for (int i = 1; i < Math.floor(145 / 7); i++) {
                if (7 * i + 11 * j == 145) {
                    System.out.println("hét fejűek: " + i + " \ntizenegy fejűek: " + j);
                }
            }
        }
    }
}
