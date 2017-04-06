package lt.ssm.controller;

import lt.ssm.service.UpdateUserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UpdateUserContr {
@RequestMapping(value="/update.do")
public String updateUserInfo(int id,String username,String birthday,String sex,String address) throws Exception{
	UpdateUserService updateUserService=new UpdateUserService();
	updateUserService.updateUser(id, username, birthday, sex, address);
	return "viewUser";
}
}
