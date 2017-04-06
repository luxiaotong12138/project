package lt.ssm.controller;

import lt.ssm.service.DeleteItemsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/items")
public class DeleteItemsContr {
@RequestMapping(value="delete.do")
public String deleteItems(int id)throws Exception{
	DeleteItemsService deleteItemsService=new DeleteItemsService();
	deleteItemsService.deleteItems(id);
	return"viewItems";
}
}
