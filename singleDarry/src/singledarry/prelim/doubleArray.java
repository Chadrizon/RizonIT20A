/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singledarry.prelim;

/**
 *
 * @author admin
 */
public class doubleArray {
    public static void main (String[] args) {
        int rizon[][] = {
            {90,50, 30},
            {30,50,90},
            {70,90,70}
        };
        for(int i = 0; i < rizon.length; i++) {
        for(int j = 0; j < rizon[i].length; j++) {
            System.out.print (rizon[i][j] + "");
        }
        System.out.println();
    }
    }
}

