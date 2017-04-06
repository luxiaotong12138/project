package lt.ssm.service;

import lt.ssm.mapper.ItemsMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindtotalRecordService {
	public int fingtotalRecordByType(String type) throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
					int total=itemsMapper.totalRecord(type);
		System.out.println("FindUserByIdService" + itemsMapper);
		return total;
	}
}
