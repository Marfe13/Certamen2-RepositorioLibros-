/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public abstract class Libro {
    private String titulo;
    private String autor;
    private int precio;
    
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.precio = 0;
    }
    
    public Libro(String titulo, String autor, int precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
