package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/item")
public class ItemController {

//	private final ItemService itemService;
	
//	@Autowired
//	public ItemController(ItemService itemService) {
//		this.itemService = itemService;
//	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
