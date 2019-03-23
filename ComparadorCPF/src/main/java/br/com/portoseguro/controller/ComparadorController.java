package br.com.portoseguro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.portoseguro.service.ComparadorService;

@Controller   
@RequestMapping(path="/comparador") 
public class ComparadorController {
	
	@Autowired
	private ComparadorService comparadorService;
	
	@GetMapping(path="/new")
	public String newStore() {	
		return "store/new";
	}
	
	@GetMapping(path="/find")
	public String findStore() {	
		return "store/find";
	}
	
	

	
	@GetMapping(path="/update") 
	public String appendStore (@RequestParam Integer id, String name,
			@RequestParam String address, Model model) {

		/*Store s = new Store();
		s.setId(id);
		s.setName(name);
		s.setAddress(address);
		storeService.save(s);
		model.addAttribute("message", "Store " + name + " updated with success!");*/
		return "store/append";
	}
}
