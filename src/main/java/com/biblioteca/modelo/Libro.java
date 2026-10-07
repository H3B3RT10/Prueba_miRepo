/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.modelo;

/**
 *
 * @author heber
 */
public class Libro extends MaterialBiblioteca {
    private String autor;

    public Libro(String codigo, String titulo, String autor) {
        super(codigo, titulo);
        this.autor = autor;
    }

    // Método añadido para que puedas comprobar la herencia en tu Main
    public void mostrarInformacion() {
        System.out.println("--- Libro ---");
        System.out.println("Código: " + codigo); // Heredado de MaterialBiblioteca
        System.out.println("Título: " + titulo); // Heredado de MaterialBiblioteca
        System.out.println("Autor: " + autor);   // Propio de Libro
    }
}