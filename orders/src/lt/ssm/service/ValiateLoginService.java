package lt.ssm.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lt.ssm.mapper.UserMapper;
import lt.ssm.po.UserLogin;

public class ValiateLoginService {
	public List<UserLogin> Valiatelogin() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		  List<UserLogin> userloginInfo=userMapper.ValiateLogin();
		  
		return userloginInfo;
	}
}
