package com.fundesplai.firstspringbootproject.controller;

import com.fundesplai.firstspringbootproject.entity.Book;
import com.fundesplai.firstspringbootproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> listBooks(){
        List<Book> books = (List<Book>) bookRepository.findAll();
        return books;
    }

    private final Path root = Paths.get("uploads");

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable("id") Integer id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        return bookOptional;
    }



    @PostMapping("/")
    public void createBook(@RequestBody Book book){
        Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
        bookRepository.save(book);

    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Integer id){
        Book book = new Book();
        book.setId(id);
        bookRepository.delete(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable("id") Integer id){
        book.setId(id);
        bookRepository.save(book);
    }
}

