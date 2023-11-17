/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.certamen2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Certamen2 {
    // Tomas Moraga y Marco Fernandoy
    ArrayList<Libro> ListaLibros = new ArrayList<Libro>();
    public static void main(String[] args) {
        Academicos academicos1 = new Academicos("Libro1", "Tomy", 1500, 1);
        Novelas novela1 = new Novelas("Libro2", "Bruh", 2000, 2, "historica");
        TextoPUCV textopucv1 = new TextoPUCV("Libro3", "Sony", 3000, 3, "ING_INFORMATICA");
        
        if(textopucv1.buscarLibro(3) != null){
            textopucv1.ListarLibro();
        }
        else{
            System.out.println("No se encontro el libro");
        }
    }
}
