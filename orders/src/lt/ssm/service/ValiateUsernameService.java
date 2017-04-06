package lt.ssm.service;
import java.util.List;

import lt.ssm.mapper.UserMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValiateUsernameService {
		public   List<String> ValiateUsername() throws Exception{
			@SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"classpath:spring/applicationContext.xml");
			  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
			  List<String> username=userMapper.ValiateUsername();
			return username;
		}
}
