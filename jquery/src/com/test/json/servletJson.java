package com.test.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

public class servletJson extends HttpServlet {
/**
	 * json数据练习
	 */
	private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			String[] jsonstr={"1:{'赤峰市':{2:{'林西县':{3:'新城镇','双井镇'},'红山区','新城区'}",
					 "1:{'呼和浩特'}",
					 "1:{'包头'}"};
			String jsonStrings="{'id':'1','name':'赤峰市','id':'1','name':'呼和浩特','id':'赤峰市','name':'林西县'}";		
		
			/*Map<String, Menus> map=new HashMap<String, Menus>();
		
			List<Menus>  m1=new ArrayList<Menus>();
			List<Menus>  m2=new ArrayList<Menus>();
			List<Menus>  m3=new ArrayList<Menus>();
			Menus  menus=new Menus();
			menus.setId(1);
			menus.setNum(1);
			menus.setName("西安市");
			Menus  menus1=new Menus();
			menus1.setId(2);
			menus1.setNum(2);
			menus1.setName("高新区");
			Menus  menus2=new Menus();
			menus2.setId(3);
			menus2.setNum(2);
			menus2.setName("临潼区");
			Menus  menus3=new Menus();
			menus3.setId(4);
			menus3.setNum(2);
			menus3.setName("长安区");
			Menus  menus4=new Menus();
			menus4.setId(5);
			menus4.setNum(3);
			menus4.setName("樱花广场");
			
			Menus  menus5=new Menus();
			menus5.setId(5);
			menus5.setNum(3);
			menus5.setName("郭杜街道");
			m1.add(menus);
			m2.add(menus1);
			m2.add(menus2);
			m2.add(menus3);
			m3.add(menus4);
			m3.add(menus5);
			System.out.println(jsonstr.length);
			jsonObject.putAll(jsonObject);
			jsonObject.put("menus1", m1);
			jsonObject.put("menus2", m2);
			jsonObject.put("menus3", m3);*/
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("menus",jsonStrings);
			req.setAttribute("json", jsonObject);
	req.getRequestDispatcher("html/menus.jsp").forward(req, resp);
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req,resp);
	}
}
