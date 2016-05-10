package com.lbe.spring.sb.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lbe.spring.sb.form.Book;
import com.lbe.spring.sb.form.User;

@Controller
public class BookController {

	@ModelAttribute("book")
	public Book bookForm() {
		return new Book();
	}

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String book(HttpSession session) {
		User user =(User) session.getAttribute("user");
		String role = user.getRole();
		session.setAttribute("user", user);
		if ("NONE".equals(role)) {
			return "unauthorisedUser";
		}
		return "book";
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String book(@Valid Book book, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "book";
		}
		return "redirect:/bookResult";
	}

}
