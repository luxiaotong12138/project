package lt.ssm.controller;

import lt.ssm.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class RegisterContr {
	@RequestMapping(value = "/register.do")
	public String Register(String username,String password,String sex,String birthday,String address, Model model)
			throws Exception {
		RegisterService registerService = new RegisterService();
		registerService.registerUser(username, sex, birthday, address);
		registerService.registerUserlogin(username, password);
		model.addAttribute("message", "恭喜你注册成功！你的用户名是:"+username);
		return "success";

	}
}