package lt.ssm.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import lt.ssm.mapper.OrdersMapper;
import lt.ssm.po.OrderDetail;
import lt.ssm.po.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 购物车功能
 * 
 */
public class ShoppingCartService {
	public void ShoppingCart( int user_id, String number,
			String createtime, String note,int orders_id, int items_id,
			int items_num) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		OrdersMapper ordersMapper = (OrdersMapper) applicationContext
				.getBean("ordersMapper");
		//setOrdersDetail的属性
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrders_id(orders_id);
		orderDetail.setItems_id(items_id);
		orderDetail.setItems_num(items_num);
		//setOrders的属性
		Orders orders = new Orders();
		orders.setUser_id(user_id);
		orders.setNumber(number);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf.parse(createtime);
		orders.setCreatetime(date);
		orders.setNote(note);
		ordersMapper.shoppingCartOrders(orders);
		ordersMapper.shoppingCartOrderDetail(orderDetail);
	
		
	}
}