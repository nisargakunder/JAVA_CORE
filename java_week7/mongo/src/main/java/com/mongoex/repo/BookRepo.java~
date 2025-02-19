package com.mongoex.repo;

import com.mongoex.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends MongoRepository<Book, String> {
public  Book findByName(String name);
public Book findByAuthor(String author);
public Book findByNameOrAuthor(String name,String author);
@Query("{id: ?0}")
public Book getBookByTdQuery(String id);
@Query("{pages:{$lt:?0}}")
public List<Book> getbyPagesless(int pages);
}
