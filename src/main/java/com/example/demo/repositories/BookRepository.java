package com.example.demo.repositories;

import com.example.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bubul on 08-11-2017.
 */
public interface BookRepository extends CrudRepository<Book,Long>{

}
