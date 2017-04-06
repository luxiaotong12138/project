package lt.ssm.controller;

import lt.ssm.service.DeleteUserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class DeleteUserContr {
@RequestMapping(value="/delete.do")
public String deleteUser(int id,Model model) throws Exception{
	DeleteUserService deleteUserService=new DeleteUserService();
	deleteUserService.deleteUser(id);
	return "viewUser";
}
}
