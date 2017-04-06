package lt.ssm.controller;

import java.util.List;

import lt.ssm.po.Items;
import lt.ssm.service.ViewItemsService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/view")
public class ViewItemsContr {
@RequestMapping(value="/items.do")
public String viewItems(Model model) throws Exception{
	ViewItemsService viewItemsService=new ViewItemsService();
	List<Items> items=viewItemsService.viewItems();
	model.addAttribute("itemsInfo", items);
	return "viewItems";
}
}
