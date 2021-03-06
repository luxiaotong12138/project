package lt.ssm.service;

import java.util.List;

import lt.ssm.mapper.ItemsMapper;
import lt.ssm.po.Items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SearchItemsByNameService {
	@SuppressWarnings("resource")
	public List<Items> searchItemsByname(String name) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		List<Items> items = itemsMapper.searchItemsByName(name);
		System.out.println("FindUserByIdService" + items);
		return items;

	}
}
