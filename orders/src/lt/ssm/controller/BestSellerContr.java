package lt.ssm.controller;

import java.util.List;

import lt.ssm.pojo.BestSeller;
import lt.ssm.service.BestSellerService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/items")
public class BestSellerContr {
@RequestMapping(value="/BestSellers.do")
	public String getBestSeller(Model model) throws Exception{
	BestSellerService bestSellerService=new BestSellerService();
	List<BestSeller> bestSeller=bestSellerService.viewBestSeller();
	model.addAttribute("bestSeller", bestSeller);
	return "bestSellers";
}
}
