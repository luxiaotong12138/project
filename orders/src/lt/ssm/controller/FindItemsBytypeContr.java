package lt.ssm.controller;

import java.util.List;

import lt.ssm.po.Items;
import lt.ssm.service.FindItemsBytypePageFService;
import lt.ssm.service.FindItemsBytypeService;
import lt.ssm.service.FindtotalRecordService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/items")
public class FindItemsBytypeContr {
	String type=null;
	@RequestMapping(value = "/view.do")
	public String finfItemsByType(String str, Model model) throws Exception {
		type=str;
		System.out.println("测试FindItemsBytypeContr"+type);
		FindItemsBytypeService findItemsBytypeService = new FindItemsBytypeService();
		List<Items> items1 = findItemsBytypeService.findItemsBytypef(str);
		List<Items> items2 = findItemsBytypeService.findItemsBytypel(str);
		FindtotalRecordService findtotalRecordService=new FindtotalRecordService();
		int total=findtotalRecordService.fingtotalRecordByType(str);
		int pagenum=new FindItemsBytypeContr().PagesNum(total);
		//获取用户名
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("items1", items1);
		model.addAttribute("items2", items2);
	
		return "view";
	}
	public int PagesNum(int num) {
		int total = 0;
		if (num % 8 != 0) {
			total = num / 8 + 1;
		} else {
			total = num / 8;
		}
		return total;
	}
    @RequestMapping(value = "/viewpage.do")
	public String finfItemsByTypePage( String str, Model model) throws Exception {
		int pagenum=Integer.parseInt(str);
		System.out.println(str);
		FindItemsBytypePageFService findItemsBytypePageFService = new FindItemsBytypePageFService();
									int record=new FindItemsBytypeContr().num(pagenum);
		List<Items> items1 = findItemsBytypePageFService.findItemsBytypePagef(type, record);
		List<Items> items2 =findItemsBytypePageFService.findItemsBytypePagel(type, record);
		new FindItemsBytypeContr().finfItemsByType(type,model);
		//用户名的获取
		
		model.addAttribute("items1", items1);
		model.addAttribute("items2", items2);
		System.out.println("----------------------------------------------");
		
		return "view";
	}
    public int num(int p){
    	int pu=(p-1)*8;
    	
    	return pu;
    }
}
