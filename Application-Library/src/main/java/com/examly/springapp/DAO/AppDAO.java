package com.examly.springapp.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examly.springapp.Model.BookModel;


public interface AppDAO extends JpaRepository<BookModel,Integer>{
	@Query(value = "SELECT * FROM Book_Model u WHERE genre = ?1", nativeQuery = true)
	public List<BookModel> findByName(String id);

}
