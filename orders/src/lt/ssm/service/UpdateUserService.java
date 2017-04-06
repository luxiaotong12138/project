package lt.ssm.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import lt.ssm.mapper.UserMapper;
import lt.ssm.po.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateUserService {
	public void updateUser(int id,String username,String birthday,String sex,String address)throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		  User user=new User();
		  user.setId(id);
		  user.setUsername(username);
			SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
			  Date date = sdf.parse(birthday);
		  user.setBirthday(date);
		  user.setSex(sex);
		  user.setAddress(address);
		  userMapper.updateUser(user);
		 
		
	}
}
