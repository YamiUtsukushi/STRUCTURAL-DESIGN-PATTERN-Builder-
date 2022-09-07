/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpbuilder;

/**
 *
 * @author JiJi
 */
public class EmployerBuilder {
    
    private int id;
    private String nom;
    private String matricule;
    private double salaire;    
    
    private String numero;
    private String prenom;

    public EmployerBuilder() {
    }

    public static EmployerBuilder builder(){
    
        return new EmployerBuilder();
    }
    
    public EmployerBuilder addId(int id){
    
        this.id = id;
        return this;
       
    }
    
    public EmployerBuilder addNom(String nom){
    
        this.nom = nom;
        return this;
    }
    
    public EmployerBuilder addMatricule(String matricule){
    
        this.matricule = matricule;
        return this;
       
    }
    
    public EmployerBuilder addSalaire(double salaire){
    
        this.salaire = salaire;
        return this;
    }
    
       
    public EmployerBuilder addNumero(String numero){
    
        this.numero = numero;
        return this;
    }
    
    public EmployerBuilder addPrenom(String prenom){
    
        this.prenom = prenom;
        return this;
    }
    
    public Employe build(){
        
        Employe employe = new Employe();
        
        employe.setId(id);
        employe.setNom(nom);
        employe.setMatricule(matricule);
        employe.setSalaire(salaire);
        
        employe.setNumero(numero);
        employe.setPrenom(prenom);
        
        
        return employe;
        
    }


    
    
}
