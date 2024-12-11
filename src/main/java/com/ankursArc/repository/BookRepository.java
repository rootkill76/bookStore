package com.ankursArc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankursArc.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}
