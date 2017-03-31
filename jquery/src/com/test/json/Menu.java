package com.test.json;

import java.util.List;

public class Menu {
	private int num;//	用来判断级别数
	private List<String> typeName; //名称

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public List<String> getTypeName() {
		return typeName;
	}
	public void setTypeName(List<String> typeName) {
		this.typeName = typeName;
	}
	
	
}
