package com.example.demo.repositories;

import com.example.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bubul on 08-11-2017.
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
