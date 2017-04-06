package lt.ssm.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import lt.ssm.mapper.ItemsMapper;
import lt.ssm.po.Items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateItemsService {
	@SuppressWarnings("resource")
	public void updateItems(int id,String name,String price,String detail,String pic,String createtime,String ordertype) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		Items items=new Items();
		items.setId(id);
		items.setName(name);
		items.setDetail(detail);
		items.setPic(pic);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=format.parse(createtime);
		System.out.println("==================="+date.toString());
		items.setCreatetime(date);
		items.setOrdertype(ordertype);
			itemsMapper.updateItems(items);
		
			
}
}