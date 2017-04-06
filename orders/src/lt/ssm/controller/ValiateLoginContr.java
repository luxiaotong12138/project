package lt.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import lt.ssm.po.UserLogin;
import lt.ssm.pojo.ShoppingCart;
import lt.ssm.service.FindMaxOrdersIdService;
import lt.ssm.service.MyPurchaseService;
import lt.ssm.service.MyShoppingCartService;
import lt.ssm.service.ShoppingCartPurchaseService;
import lt.ssm.service.ShoppingCartService;
import lt.ssm.service.ValiateLoginService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/login")
// 登录验证
public class ValiateLoginContr {
	String strid = null;
	String result = null;

	@RequestMapping(value = "/valiatelogin.do")
	public String valiateLogin(String username, String password, Model model)
			throws Exception {
		ValiateLoginService valiateLoginService = new ValiateLoginService();
		List<UserLogin> userLogin = valiateLoginService.Valiatelogin();

		for (UserLogin user : userLogin) {
			// id=user.getUserid();
			strid = user.getUserid().toString();
			System.out.println(user);
			if (username != null && password != null) {
				if (username.equals(user.getUsername())
						&& password.equals(user.getPassword())) {
					result = username;
					// 获取用户名的方法,让其他类可以获取用户名
					//FindItemsBytypeContr findItemsBytypeContr = new FindItemsBytypeContr();
					System.out
							.println("=============================" + result);
					
					model.addAttribute("result", result);
					return "main";
				} else if (username != user.getUsername()
						|| username != user.getPassword()) {
					result = "用户名或密码错误";
					model.addAttribute("result", result);
				}
			} else if (username == null && password == null) {
				result = "用户名和密码不能为空";
				model.addAttribute("result", result);
				return "login";
			}
		}
		return "login";
	}

	// 购物车的实现
	@RequestMapping(value = "/shoppingCart.do")
	public String shoppingCart(int items_num, String str, Model model)
			throws Exception {
		if (strid == null) {
			String message = "请先登录";
			model.addAttribute("result", message);
			return "login";
		}
		ShoppingCartService shoppingCartService = new ShoppingCartService();
		// 订单号的生成
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = formatter.format(new Date());
		int id = Integer.parseInt(strid);
		String number = id + date;
		SimpleDateFormat times = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = times.format(new Date());
		String createtime = date1;
		String note = "购物车";
		FindMaxOrdersIdService findMaxOrdersIdService = new FindMaxOrdersIdService();
		int orders_id = findMaxOrdersIdService.findMaxOrdersId() + 1;
		int items_id = Integer.parseInt(str);
		int user_id = id;
		shoppingCartService.ShoppingCart(user_id, number, createtime, note,
				orders_id, items_id, items_num);
		model.addAttribute("number", number);
		model.addAttribute("items_num", items_num);
		return "confirm";
	}

	// 立即购买的实现
	@RequestMapping(value = "/purchase.do")
	public String purchase(int items_num, String str, Model model)
			throws Exception {
		if (strid == null) {
			String message = "请先登录";
			model.addAttribute("result", message);
			return "login";
		}
		ShoppingCartService shoppingCartService = new ShoppingCartService();
		// 订单号的生成
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = formatter.format(new Date());
		int id = Integer.parseInt(strid);
		String number = id + date;
		SimpleDateFormat times = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = times.format(new Date());
		String createtime = date1;
		String note = "已购买";
		FindMaxOrdersIdService findMaxOrdersIdService = new FindMaxOrdersIdService();
		int orders_id = findMaxOrdersIdService.findMaxOrdersId() + 1;
		int items_id = Integer.parseInt(str);
		int user_id = id;
		shoppingCartService.ShoppingCart(user_id, number, createtime, note,
				orders_id, items_id, items_num);
		model.addAttribute("number", number);
		model.addAttribute("items_num", items_num);
		return "confirm";
	}
	//显示购物车里面的东西
@RequestMapping(value="/myShoppingCart.do")
	public String myShoppingCart(Model model) throws Exception{
		if(strid==null){
			String message="请先登录";
				model.addAttribute("message", message);
						return "login";
				}
		int id=Integer.parseInt(strid);
		String note="购物车";
		MyShoppingCartService myShoppingCartService=new MyShoppingCartService();
		List<ShoppingCart> shoppingCart= myShoppingCartService.myShoppingCart(id, note);
		
		model.addAttribute("shoppingCart", shoppingCart);
		
		return "myShoppingCart";
	}
@RequestMapping(value="/myShoppingCartPurchase.do")
public String myShoppingCartPurchase(String number,Model model) throws Exception{
	String note="已购买";
	ShoppingCartPurchaseService shoppingCartPurchaseService=new ShoppingCartPurchaseService();
	System.out.println("------------------------"+number);
	shoppingCartPurchaseService.ShoppingCartPurchase(number, note);
	String message="购买成功";
	model.addAttribute("message", message);
	
	return "myShoppingCart";
}
@RequestMapping(value="/myPurchase.do")
public String myPurchase(Model model)throws Exception{
	if(strid==null){
		String message="请先登录";
			model.addAttribute("message", message);
					return "login";
			}
	int id=Integer.parseInt(strid);
	String note="已购买";
	MyPurchaseService myPurchaseService=new MyPurchaseService();
	List<ShoppingCart> shoppingCart= myPurchaseService.myPurchase(id, note);
	
	model.addAttribute("purchase", shoppingCart);
	System.out.println("++++++++++++++++++++"+shoppingCart.get(0).getNumber());
	return "purchase";
}
}
