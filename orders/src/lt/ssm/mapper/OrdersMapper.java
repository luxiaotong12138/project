package lt.ssm.mapper;

import java.util.List;

import lt.ssm.po.OrderDetail;
import lt.ssm.po.Orders;
import lt.ssm.pojo.ShoppingCart;
import lt.ssm.pojo.UserOrdersVo;

public interface OrdersMapper {
	//��ӹ��ﳵ
		public void shoppingCartOrders(Orders orders)throws Exception;
		public void shoppingCartOrderDetail(OrderDetail orderDetail)throws Exception;
		//����orders�����ID
		public int findMaxOrdersId()throws Exception;
		//��ʾ���ﳵ������û���Ʒ
		public List<ShoppingCart> myShoppingCart(UserOrdersVo userOrdersVo)throws Exception;
		//�����ﳵ�Ķ�������
		public void shoppingCartPurchase(Orders orders)throws Exception;
		//��ʾ�ѹ������Ʒ
		public List<ShoppingCart> myPurchase(UserOrdersVo userOrdersVo)throws Exception;
}
