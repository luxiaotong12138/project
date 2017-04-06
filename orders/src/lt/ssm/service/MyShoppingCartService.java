package lt.ssm.service;

import java.util.List;

import lt.ssm.mapper.OrdersMapper;
import lt.ssm.po.Orders;
import lt.ssm.po.User;
import lt.ssm.pojo.ShoppingCart;
import lt.ssm.pojo.UserOrdersVo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyShoppingCartService {
	public   List<ShoppingCart> myShoppingCart(int id,String note) throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		OrdersMapper ordersMapper=(OrdersMapper) applicationContext.getBean("ordersMapper");
		UserOrdersVo userOrdersVo=new UserOrdersVo();
		//设置user的ID
		User user=new User();
		user.setId(id);
		//设置note 是购物车 还是已购买
		Orders orders=new Orders();
		orders.setNote(note);
		userOrdersVo.setUser(user);
		userOrdersVo.setOrders(orders);
		
		List<ShoppingCart> shoppingCart= ordersMapper.myShoppingCart(userOrdersVo);
		  return shoppingCart;
}
}
