/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class Novelas extends Libro{
    private int idLibro;
    private String tipo;
    
    public Novelas() {
        super();
        this.idLibro = 0;
        this.tipo = "";
    }
    
    public Novelas(String titulo, String autor, int precio, int idLibro, String tipo){
        super(titulo, autor, precio);
        this.idLibro = idLibro;
        this.tipo = tipo;
    }
    
    public int getidLibro() {
        return idLibro;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setidLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    public void setTipoLibro(String tipo) {
        this.tipo = tipo;
    }
    
    public Novelas buscarLibro(int idLibro){
        Novelas novelas = new Novelas();
        novelas.setTitulo(getTitulo());
        novelas.setAutor(getAutor());
        novelas.setPrecio(getPrecio());
        novelas.setidLibro(getidLibro());
        novelas.setTipoLibro(getTipo());
        
        if(idLibro == getidLibro()){
            return novelas;
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
        System.out.println("El tipo de libro es "+getTipo());
        System.out.println("El libro es novela");
    }
    
}
