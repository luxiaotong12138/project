package lt.ssm.service;

import lt.ssm.mapper.OrdersMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindMaxOrdersIdService {
	public   int findMaxOrdersId() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		OrdersMapper ordersMapper=(OrdersMapper) applicationContext.getBean("ordersMapper");
		  int id=ordersMapper.findMaxOrdersId();
		  return id;
}
}