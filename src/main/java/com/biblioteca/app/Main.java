/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.app;
import com.biblioteca.modelo.Libro;
import com.biblioteca.modelo.Revista;

/**
 *
 * @author heber
 */
public class Main {
    public static void main(String[] args) {
        
        // Creación de un objeto Libro usando herencia
        Libro libro = new Libro("LIB-001", "1984", "George Orwell");
        libro.mostrarInformacion();
        
        System.out.println();
        
        // Creación de un objeto Revista usando herencia
        Revista revista = new Revista("REV-001", "National Geographic", "Varios Autores");
        revista.mostrarInformacion();
    }
}

