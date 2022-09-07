/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week11tpbuilder;

/**
 *
 * @author JiJi
 */
public class Week11TpBuilder {

    public static void main(String[] args) {
        
        Employe employe = EmployerBuilder.builder()
                .addId(12)
                .addNom("Mooken")
                .addMatricule("1938NFV8718")
                .addSalaire(4500)
                .addNumero("18320387")
                .addPrenom("Jayson")
                .build();
        
        
        System.out.println(employe.toString());
    }
}
