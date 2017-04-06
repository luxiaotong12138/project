package lt.ssm.service;

import java.util.List;

import lt.ssm.mapper.ItemsMapper;
import lt.ssm.po.Items;
import lt.ssm.pojo.PageItems;
import lt.ssm.pojo.PageItemsVo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindItemsBytypePageFService {
	@SuppressWarnings("resource")
	public List<Items> findItemsBytypePagef(String type,int pagenum) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		PageItemsVo pageItemsVo=new PageItemsVo();
		PageItems pageItems=new PageItems();
		pageItems.setOrdertype(type);
		pageItemsVo.setPageItems(pageItems);
		pageItemsVo.setSpagenum(pagenum);
		List<Items> items = itemsMapper.findItemsBytypePageF(pageItemsVo);
		System.out.println("FindUserByIdService" + type);
		return items;

	}
	@SuppressWarnings("resource")
	public List<Items> findItemsBytypePagel(String type,int pagenum) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext
				.getBean("itemsMapper");
		PageItemsVo pageItemsVo=new PageItemsVo();
		PageItems pageItems=new PageItems();
		pageItems.setOrdertype(type);
		pageItemsVo.setPageItems(pageItems);
		pageItemsVo.setSpagenum(pagenum+4);
		List<Items> items = itemsMapper.findItemsBytypePageF(pageItemsVo);
		System.out.println("FindUserByIdService" + type);
		return items;

	}
}
