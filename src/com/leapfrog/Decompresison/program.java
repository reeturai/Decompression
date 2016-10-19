/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Decompresison;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to decompress");
        String ch = in.next();
        String output = "";
        char prev = '0';
        for (int i = 0; i < ch.length(); i++) {
            prev = ch.charAt(i);
            boolean yes = Character.isDigit(prev);
            if (yes) {
                i++;
                for (int j = 0; j < Character.getNumericValue(prev); j++) {

                    output = output.concat(Character.toString(ch.charAt(i)));
                } 
            }
            System.out.println(output);

        }
    }
}
