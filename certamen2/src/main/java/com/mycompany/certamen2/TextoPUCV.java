/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class TextoPUCV extends Libro{
    private int idLibro;
    private String escuelaPublicada;
    
    public TextoPUCV() {
        super();
        this.idLibro = 0;
        this.escuelaPublicada = "";
    }
    
    public TextoPUCV(String titulo, String autor, int precio, int idLibro, String escuelaPublicada){
        super(titulo, autor, precio);
        this.idLibro = idLibro;
        this.escuelaPublicada = escuelaPublicada;
    }
    
    public int getidLibro() {
        return idLibro;
    }
    
    public String getescuelaPublicada() {
        return escuelaPublicada;
    }
    
    public void setidLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    public void setescuelaPublicada(String escuelaPublicada) {
        this.escuelaPublicada = escuelaPublicada;
    }
    
    public TextoPUCV buscarLibro(int idLibro){
        TextoPUCV textopucv = new TextoPUCV();
        textopucv.setTitulo(getTitulo());
        textopucv.setAutor(getAutor());
        textopucv.setPrecio(getPrecio());
        textopucv.setidLibro(getidLibro());
        textopucv.setescuelaPublicada(getescuelaPublicada());
        
        if(idLibro == getidLibro()){
            return textopucv;
        }
        else{
            return null;
        }
    }
    
    public void ListarLibro(){
        System.out.println("El titulo es "+getTitulo());
        System.out.println("El autor es "+getAutor());
        System.out.println("El precio es "+getPrecio());
        System.out.println("El id del libro es "+getidLibro());
        System.out.println("La escuela que publica el libro es "+getescuelaPublicada());
        System.out.println("El libro es un texto PUCV");
    }
}
