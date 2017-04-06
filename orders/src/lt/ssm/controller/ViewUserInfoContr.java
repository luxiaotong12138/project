package lt.ssm.controller;

import java.util.List;

import lt.ssm.po.User;
import lt.ssm.service.ViewUserInfoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/view")
public class ViewUserInfoContr {
@RequestMapping(value="/user.do")
	public String viewUserinfo(Model model) throws Exception{
	ViewUserInfoService viewUserInfoService=new ViewUserInfoService();
	List<User> user=viewUserInfoService.viewUserInfor();
	model.addAttribute("userinfo", user);
	return "viewUser";
}
}
