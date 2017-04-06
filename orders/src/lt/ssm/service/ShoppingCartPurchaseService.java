package lt.ssm.service;

import lt.ssm.mapper.OrdersMapper;
import lt.ssm.po.Orders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingCartPurchaseService {
	public void ShoppingCartPurchase( String number,String note) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		OrdersMapper ordersMapper = (OrdersMapper) applicationContext
				.getBean("ordersMapper");
		Orders orders =new Orders();
		orders.setNumber(number);
		orders.setNote(note);
		ordersMapper.shoppingCartPurchase(orders);
}
}