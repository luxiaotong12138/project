package lt.ssm.controller;

import java.util.List;

import lt.ssm.po.Items;
import lt.ssm.service.FindItemsByIDService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/items")
public class FindItemsByidContr {
@RequestMapping(value="/detailView.do")
	public String finfItemsByType( String str,Model model) throws Exception{
			System.out.println(str);
		int id=Integer.parseInt(str);
		FindItemsByIDService findItemsByIDService=new FindItemsByIDService();
			List<Items> items=findItemsByIDService.findItemsByid(id);
			model.addAttribute("items", items);
			//用户名的获取
			//ValiateLoginContr valiateLoginContr=new ValiateLoginContr();
			//String result=valiateLoginContr.getUsername();
			System.out.println("----------------------------------------------");
			//System.out.println("用户名"+result);
			
			//model.addAttribute("result", result);
		return "orderdetail";
	}
}
