package projet.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projet.spring.entities.Admin;
import projet.spring.services.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;


	//Ajout
	@PostMapping("/AjouterAdmin")
	@ResponseBody
	//Kif yabda aandou barsha paramètres naaml @RequestBody
	public Admin AjouterBlog(@RequestBody Admin a) {
		return adminservice.AjouterAdmin(a);
	}
	
}
