package lt.ssm.controller;

import java.util.List;

import lt.ssm.service.ValiateUsernameService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class ValiateUsernameContr {
	@RequestMapping(value = "/valiateUsername.do")
	public String ValiateUsername(String username, Model model)
			throws Exception {
		ValiateUsernameService valiateUsernameService = new ValiateUsernameService();
		List<String> userName = valiateUsernameService.ValiateUsername();
		String result = null;
		for (String user : userName) {
			System.out.println(user);
		}
		if (userName.contains(username)) {
			result = "<font color='red'>该用户已经被使用</font>";
		} else {
			result = "<font color='green'>用户名可以使用</font>";
		}
		model.addAttribute("result", result);
		return "register";

	}
}
