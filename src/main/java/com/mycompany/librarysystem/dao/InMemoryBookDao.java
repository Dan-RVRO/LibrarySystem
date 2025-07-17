/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarysystem.dao;

import com.mycompany.librarySystem.model.Book;
import java.util.*;

public class InMemoryBookDao implements BookDao {
    private final Map<String, Book> storageHashMap = new HashMap<>();
    private final List<String> storageArrayList = new ArrayList<>();

    @Override
    public void add(Book book) {
        storageHashMap.put(book.getIsbn(), book);
    }

    public void add2ArrayList(Book book) {
        storageArrayList.add(book.getTitle());
    }
    
    public List<String> findAll2() {
        // Return a copy of the ISBN list
        return new ArrayList<>(storageArrayList);
    }
    @Override
    public Book findByIsbn(String isbn) {
        return storageHashMap.get(isbn);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storageHashMap.values());
    }

    @Override
    public void remove(String isbn) {
        storageHashMap.remove(isbn);
    }
}