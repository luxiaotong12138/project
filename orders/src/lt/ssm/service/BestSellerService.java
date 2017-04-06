package lt.ssm.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lt.ssm.mapper.ItemsMapper;
import lt.ssm.pojo.BestSeller;

public class BestSellerService {
	public List<BestSeller> viewBestSeller() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		List<BestSeller> bestSeller=itemsMapper.viewBestSeller();
		return bestSeller;
}
}
