package lt.ssm.service;
import lt.ssm.mapper.ItemsMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteItemsService {
	@SuppressWarnings("resource")
	public void deleteItems(int id) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
				itemsMapper.deleteItems(id);

}
}
