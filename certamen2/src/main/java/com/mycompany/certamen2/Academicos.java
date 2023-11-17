/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Academicos extends Libro {
    private int idLibro;
    private Scanner entrada;
    
    public Academicos() {
        super();
        this.idLibro = 0;
        this.entrada = new Scanner(System.in);
    }
    
    public Academicos(String titulo, String autor, int precio, int idLibro){
        super(titulo, autor, precio);
        this.idLibro = idLibro;
    }
    
    public int getidLibro() {
        return idLibro;
    }
    
    public void setidLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    public Academicos buscarLibro(int idLibro){
        Academicos academicos = new Academicos();
        academicos.setTitulo(getTitulo());
        academicos.setAutor(getAutor());
        academicos.setPrecio(getPrecio());
        academicos.setidLibro(getidLibro());
        
        if(idLibro == getidLibro()){
            return academicos;
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
        System.out.println("El libro es academico");
    }
}
