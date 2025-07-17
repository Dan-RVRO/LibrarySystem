/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarysystem.dao;


import com.mycompany.librarySystem.model.Book;
import java.util.List;

public interface BookDao {
    //Note that the method signatures have no braces and are terminated with a semicolon.
    void add(Book book);
    void add2ArrayList(Book book);
    Book findByIsbn(String isbn);
    List<Book> findAll();
    void remove(String isbn);
}

