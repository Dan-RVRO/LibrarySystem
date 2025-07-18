/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarysystem.dao;

import com.mycompany.librarySystem.model.Book;
import java.util.*;

public class InMemoryBookDao implements BookDao {
    
    //Fast retrieval (get(isbn)) whenever you need the full Book.
    private final Map<String, Book> storageHashMap = new HashMap<>();
    
    //method findInsertionOrder gives you books in insertion order.
    private final List<String> storageArrayList = new ArrayList<>();

    @Override
    public void add(Book book) {
        storageHashMap.put(book.getIsbn(), book);
        
        if (!storageArrayList.contains(book.getIsbn())){
            storageArrayList.add(book.getIsbn());
        }  
    }
    
    @Override
    public Book findByIsbn(String isbn) {
        return storageHashMap.get(isbn);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storageHashMap.values());
    }
        
    public List<String> findInsertionOrder() {
        return new ArrayList<>(storageArrayList);
    }

    @Override
    public void remove(String isbn) {
        storageHashMap.remove(isbn);
        storageArrayList.remove(isbn);
    }
}