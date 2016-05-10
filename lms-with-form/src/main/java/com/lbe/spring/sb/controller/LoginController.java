package com.lbe.spring.sb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lbe.spring.sb.form.User;
import com.lbe.spring.sb.repository.UserDao;

//@SessionAttributes("user")
@Controller
public class LoginController {

	@Autowired
	private UserDao userDao;

	@ModelAttribute("user")
	public User formBean() {
		return new User();
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String signUp() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@Valid User user, BindingResult bindingResult, HttpSession session) {

		if (bindingResult.hasErrors()) {
			return new ModelAndView("login");
		}
		if (userDao.isValidUser(user.getUsername())) {
			user.setRole(userDao.getRole(user.getUsername()));
			session.setAttribute("user", user);
			return new ModelAndView("redirect:/book");
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		map.put("error", "Invalid Password");
		return new ModelAndView("login", map);
	}

}
