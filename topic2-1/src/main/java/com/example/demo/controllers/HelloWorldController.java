package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Person;

@Controller
public class HelloWorldController {
	// return a string from a /test1 url
	@GetMapping("/test1")
	@ResponseBody
	public String printHello()
	{
		return "Hello World!";
	}

	@GetMapping("/test2")
	public String showHelloPage(Model model)
	{
		model.addAttribute("message", "Have a great day!");
		model.addAttribute("rating", 99);
		model.addAttribute("report", "Some great news from the station");
		return "helloPage";
	}

	@GetMapping("/test3")
	public ModelAndView showHelloPageAgain()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Have a super day!");
		mv.addObject("rating", 55);
		mv.setViewName("helloPage");
		return mv;
	}

	@GetMapping("/test4")
	public String showHelloPage4(@RequestParam("message") String message, Model model)
	{
		model.addAttribute("message", message);
		model.addAttribute("rating", 22);
		model.addAttribute("report", "Some great news from the station");
		return "helloPage";
	}

	@GetMapping("/people")
	public String showFriends(Model model)
	{
		List<Person> friends = new ArrayList<Person>();

		friends.add(new Person(0, "Allan", 23, 142.2f));
		friends.add(new Person(1, "Berry", 42, 220.0f));
		friends.add(new Person(2, "Carol", 71, 144.4f));
		friends.add(new Person(3, "Denise", 4, 38.9f));
		friends.add(new Person(4, "Esther", 19, 106.5f));

		System.out.println(friends);

		model.addAttribute("people", friends);
		return "printFriends.html";
	}

	@GetMapping("/peopleJSON")
	@ResponseBody
	public List<Person> showFriendsJSON(Model model)
	{
		List<Person> friends = new ArrayList<Person>();

		friends.add(new Person(0, "Allan", 23, 142.2f));
		friends.add(new Person(1, "Berry", 42, 220.0f));
		friends.add(new Person(2, "Carol", 71, 144.4f));
		friends.add(new Person(3, "Denise", 4, 38.9f));
		friends.add(new Person(4, "Esther", 19, 106.5f));

		System.out.println(friends);

		model.addAttribute("people", friends);
		return friends;
	}
}