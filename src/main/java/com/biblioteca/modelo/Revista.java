/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.modelo;

/**
 *
 * @author heber
 */
public class Revista extends MaterialBiblioteca {
    private String autor; 

    public Revista(String codigo, String titulo, String autor) {
        super(codigo, titulo);
        this.autor = autor;
    }

    // Método añadido para comprobar los datos
    public void mostrarInformacion() {
        System.out.println("--- Revista ---");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
