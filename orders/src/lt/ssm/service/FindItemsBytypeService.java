package lt.ssm.service;

import java.util.List;

import lt.ssm.mapper.ItemsMapper;
import lt.ssm.po.Items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FindItemsBytypeService {
	@SuppressWarnings("resource")
	public List<Items> findItemsBytypef(String ordertype) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		List<Items> items = itemsMapper.findItemsBytypeF(ordertype);
		System.out.println("FindUserByIdService" + itemsMapper);
		return items;

	}
	public List<Items> findItemsBytypel(String ordertype) throws Exception {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		List<Items> items = itemsMapper.findItemsBytypeL(ordertype);
		System.out.println("FindUserByIdService" + itemsMapper);
		return items;

	}
}
