package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.DAO.AppDAO;
import com.examly.springapp.Model.BookModel;

@RestController
public class AppController {
	@Autowired
	private AppDAO appdao;
	
	@GetMapping("/getBooks")
	public List<BookModel> getAllBooks(){
		return appdao.findAll();
	}
	
	@GetMapping("/getByType")
	public List<BookModel> getbookbygenre(@RequestParam String id){
		List<BookModel> result = appdao.findByName(id);
		return result;
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam int bookId) {
		appdao.deleteById(bookId);
		return "Deleted Successfully";
	}
	
	@PostMapping("/saveBook")
	public void saveBook(@RequestBody BookModel bookmodel) {
		appdao.save(bookmodel);
	}
	
	@PostMapping("/editBook")
	public void editBook(@RequestParam int bookId,@RequestBody BookModel bookmodel) {
		bookmodel.setBookid(bookId);
		appdao.save(bookmodel);
	}
}
