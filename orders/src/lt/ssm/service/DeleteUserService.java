package lt.ssm.service;

import lt.ssm.mapper.UserMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteUserService {
	public void deleteUser(int id)throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		  userMapper.deleteUserLogin(id);
		  userMapper.deleteUser(id);
		
	}
}
