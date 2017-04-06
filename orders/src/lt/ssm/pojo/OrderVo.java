package lt.ssm.pojo;

import lt.ssm.po.OrderDetail;
import lt.ssm.po.Orders;

public class OrderVo {
	private  Orders orders;
	private OrderDetail orderDetail;
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	
}
