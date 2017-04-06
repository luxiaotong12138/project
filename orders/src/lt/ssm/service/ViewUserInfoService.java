package lt.ssm.service;

import java.util.List;

import lt.ssm.mapper.UserMapper;
import lt.ssm.po.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViewUserInfoService {
	public   List<User> viewUserInfor() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		  List<User> user= userMapper.viewUserInfo();
		  return user;
}
}