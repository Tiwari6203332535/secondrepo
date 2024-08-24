package in.happy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.happy.entity.Book;
import in.happy.repo.Bookrepo;

@Controller
public class BookController {
	@Autowired
	private Bookrepo repo;
	
	
	
//	@GetMapping("/book")
//	public ModelAndView getBookById(@RequestParam("id") Integer id) {
//		System.out.println(id);
//		ModelAndView mav = new ModelAndView();
//		Optional<Book> byId = repo.findById(id);
//		if(byId.isPresent()) {
//			Book bookobj = byId.get();
//			//sending data to the views
//			mav.addObject("book", bookobj);
//
//		}
//	
//		mav.setViewName("index");
//		return mav;
//		
//	}
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer Bid, Model model) {
		System.out.println(Bid);
		   Optional<Book> byId = repo.findById(Bid);
		   if(byId.isPresent()) {
			   Book bookobj = byId.get();
			   model.addAttribute("book", bookobj);
			   System.out.println(bookobj);
			   
		   }
		   return "index";
	}

}
