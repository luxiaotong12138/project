package lt.ssm.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import lt.ssm.mapper.UserMapper;
import lt.ssm.po.UserLogin;
import lt.ssm.pojo.Register;
import lt.ssm.pojo.RegisterVo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegisterService {
	public   void registerUser(String username,String sex,String birthday,String address) throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		  RegisterVo registerVo=new RegisterVo();
		  Register register=new Register();
		  register.setUsername(username);
		  //日期的转化
		  SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		  Date date = sdf.parse(birthday);
		  register.setBirthday(date);
		  register.setSex(sex);
		  register.setAddress(address);
		  registerVo.setRegister(register);
			  userMapper.RegisterUser(registerVo);
		  
	}
	public   void registerUserlogin(String username,String password) throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		  UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		  RegisterVo registerVo=new RegisterVo();
		  UserLogin userLogin=new UserLogin();
		  userLogin.setUsername(username);
		  userLogin.setPassword(password);
		  registerVo.setUserLogin(userLogin);
			  userMapper.RegisterUserlogin(registerVo);
		  
	}
}
