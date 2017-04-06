package lt.ssm.controller;

import java.util.List;

import lt.ssm.po.Items;
import lt.ssm.service.SearchItemsByNameService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/items")
public class SearchItemsByNameContr {
	@RequestMapping(value = "/search.do")
	public String searchItemsByName(String name, Model model) throws Exception {
		SearchItemsByNameService searchItemsByNameService = new SearchItemsByNameService();
		List<Items> items1 = searchItemsByNameService.searchItemsByname(name);	
		model.addAttribute("items1", items1);
		return "main";
	}
}