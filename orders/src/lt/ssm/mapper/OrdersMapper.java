package lt.ssm.mapper;

import java.util.List;

import lt.ssm.po.OrderDetail;
import lt.ssm.po.Orders;
import lt.ssm.pojo.ShoppingCart;
import lt.ssm.pojo.UserOrdersVo;

public interface OrdersMapper {
	//添加购物车
		public void shoppingCartOrders(Orders orders)throws Exception;
		public void shoppingCartOrderDetail(OrderDetail orderDetail)throws Exception;
		//查找orders的最大ID
		public int findMaxOrdersId()throws Exception;
		//显示购物车里面的用户商品
		public List<ShoppingCart> myShoppingCart(UserOrdersVo userOrdersVo)throws Exception;
		//将购物车的东西购买
		public void shoppingCartPurchase(Orders orders)throws Exception;
		//显示已购买的物品
		public List<ShoppingCart> myPurchase(UserOrdersVo userOrdersVo)throws Exception;
}
