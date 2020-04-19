package com.shivam.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shivam.demo.dao.AlienRepo;
import com.shivam.demo.model.Alien;

@Controller
@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam("aid")int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(null);
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByAidGreaterThan(102));
		System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/updateAlien")
	public String updateAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@RequestParam("aid")int aid) {
		repo.deleteById(aid);
		return "redirect:/"; 
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlienRest(@PathVariable("aid")int aid) {
		Alien alien = repo.getOne(aid);
		repo.delete(alien);
		return "deleted"; 
	}
	
	@PostMapping(path="/alien" /*consumes = {"application/xml"}*/)
	public Alien addAlienRest(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@PutMapping(path="/alien")
	public Alien saveOrUpdateAlienRest(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@GetMapping(path="/aliens"/*, produces= {"application/xml"}*/)
	@ResponseBody
	public List<Alien> getAliensRest() {
		return repo.findAll();
	}
	
	
	
	@GetMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlienRest(@PathVariable("aid")int aid) {
		return repo.findById(aid);
	}

}
