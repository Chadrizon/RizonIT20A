/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arraylist;

/**
 *
 * @author admin
 */
public class doubleArray {
    public static void main (String[] args) {
        int rizon[][] = {
            {67,80,40},
            {50,50,60},
            {90,20,10}
        };
        for(int i = 0; i < rizon.length; i++) {
        for(int j = 0; j < rizon[i].length; j++) {
            System.out.print (rizon[i][j] + " ");
        }
        System.out.println();
    }
    }
}

