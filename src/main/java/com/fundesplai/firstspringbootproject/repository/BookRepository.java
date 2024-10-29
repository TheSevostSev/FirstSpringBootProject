package com.fundesplai.firstspringbootproject.repository;
import com.fundesplai.firstspringbootproject.entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Integer> {

}
