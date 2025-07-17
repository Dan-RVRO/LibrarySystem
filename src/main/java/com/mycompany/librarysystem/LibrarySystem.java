/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarysystem;

import com.mycompany.librarySystem.model.Book;
import com.mycompany.librarysystem.dao.InMemoryBookDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Danie
 */
public class LibrarySystem {

    public static void main(String[] args) {
        
        
        /*
        InMemoryBookDao dao = new InMemoryBookDao();
        
        Book b1  = new Book("001", "Java 101", "Alice", "Education");
        Book b2  = new Book("002", "Spring Boot", "Bob", "Framework");
        
        Book b4  = new Book("004", "Effective Java", "Joshua Bloch", "Programming");
        Book b5  = new Book("005", "Clean Code", "Robert C. Martin", "Programming");
        
        Book b7  = new Book("007", "Refactoring", "Martin Fowler", "Software Engineering");
        Book b8  = new Book("008", "Head First Design Patterns", "Eric Freeman", "Design");
        Book b9  = new Book("009", "Algorithms, 4th Edition", "Robert Sedgewick", "Algorithms");
        //Book b12 = new Book("012", null, null, null);
        
        Book b10 = new Book("010");
        Book b11 = new Book("011");
        Book b6  = new Book("006");
        Book b3  = new Book("003");
        
        dao.add(b10);
        dao.add(b11);
        dao.add(b6);
        dao.add(b6);
        
        //dao.add(b12);
        //dao.add(b9);
        
        System.out.println("b11: " + b11);
        //System.out.println("b12: " + b12);
        //System.out.println("b9: " + b9);
        System.out.println("All Books HahsMap: " + dao.findAll());
        System.out.println("");
        
        dao.add2ArrayList(b10);
        dao.add2ArrayList(b11);
        dao.add2ArrayList(b6);
        System.out.println("All Books ArrayList: " + dao.findAll2());
        
        */
/*          InMemoryBookDao dao = new InMemoryBookDao();
        dao.add(b1);
        dao.add(b2);
        dao.add(b3);
        dao.add(b4);
        dao.add(b5);
        dao.add(b6);
        dao.add(b7);
        dao.add(b8);
        dao.add(b9);
        dao.add(b10);
        dao.add2(b10);
        
      
        System.out.println("All findAll2: " + dao.findAll2());

        System.out.println("All Books: " + dao.findAll());
        System.out.println("Find ISBN 001: " + dao.findByIsbn("001"));
        System.out.println("Find ISBN 003: " + dao.findByIsbn("003"));
        
        System.out.println("Find ISBN Book: b9: " + b9.getIsbn());
        System.out.println("Title: " + b8.getTitle());
        b8.setTitle("Hola Mundo");
        b8.checkout();
        System.out.println("available: " + b7.isAvailable());
        b7.checkout();
        System.out.println("available: " + b7.isAvailable());
        b7.returnToShelf();
        System.out.println("available: " + b7.isAvailable());
        
        String s = b7.toString();
        System.out.println("ToStrinOverride: " + s);
        
        int i = b7.compareTo(b10);
        System.out.println("compareToOverride: " + i);
       
        dao.remove("001");
        System.out.println("After removal: " + dao.findAll());
        

        // 1. toString()
        System.out.println("=== toString() ===");
        System.out.println(b1);   // invokes b1.toString()
        System.out.println();

        // 2. equals() & hashCode()
        System.out.println("=== equals() & hashCode() ===");
        System.out.println("b1.equals(b2)? " + b1.equals(b2)); 
        System.out.println("b1.equals(b1)? " + b1.equals(b1));
        System.out.println("b1.equals(b3)? " + b1.equals(b3)); 
        System.out.println("b1.hashCode(): " + b1.hashCode());
        System.out.println("b2.hashCode(): " + b2.hashCode()); 
        System.out.println();

        // 3. Demonstrate HashSet deduplication
        Set<Book> set = new HashSet<>(Arrays.asList(b1, b2, b3, b1));
        System.out.println("HashSet contents (duplicates removed):");
        set.forEach(System.out::println);
        System.out.println();

        // 4. compareTo() via sorting
        //- After sorting, the titles print in alphabetical order regardless of original positions or capitalization.

        System.out.println("=== compareTo() & Sorting ===");
        List<Book> list = new ArrayList<>(Arrays.asList(b3, b5, b1, b4));
        System.out.println("Before sort:");
        list.forEach(b -> System.out.println("  " + b.getTitle()));
        
        Collections.sort(list);   // uses compareTo (title, case-insensitive)
        
        System.out.println("After sort:");
        list.forEach(b -> System.out.println("  " + b.getTitle()));
        System.out.println();

        // 5. Direct compareTo() calls
        System.out.println("Direct compareTo() results:");
        System.out.println("b4 vs b5: " + b4.compareTo(b5)); 
        System.out.println("b5 vs b4: " + b5.compareTo(b4)); 
        
        
        System.out.println("All Books: " + dao.findAll());

*/
    }
}
 
