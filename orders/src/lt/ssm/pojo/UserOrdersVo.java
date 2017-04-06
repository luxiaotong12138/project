package lt.ssm.pojo;

import lt.ssm.po.Orders;
import lt.ssm.po.User;

public class UserOrdersVo {
	private User user;
	private Orders orders;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
