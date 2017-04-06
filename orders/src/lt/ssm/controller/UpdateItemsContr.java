package lt.ssm.controller;

import lt.ssm.service.UpdateItemsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/items")
public class UpdateItemsContr {
@RequestMapping(value="/update.do")
public String updateItems(int id,String name,String price,String detail,String pic,String createtime,String ordertype)throws Exception{
	UpdateItemsService updateItemsService=new UpdateItemsService();
	updateItemsService.updateItems(id, name, price, detail, pic, createtime, ordertype);
	return "viewItems";
}

}
