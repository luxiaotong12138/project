package lt.ssm.pojo;

import java.util.Date;

public class ShoppingCart {
	private Integer items_num;
	private String name;
	private String price;
	private String pic;
	private String number;
	private Date createtime;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Integer getItems_num() {
		return items_num;
	}
	public void setItems_num(Integer items_num) {
		this.items_num = items_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
