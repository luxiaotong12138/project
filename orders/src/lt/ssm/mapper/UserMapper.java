package lt.ssm.mapper;

import java.util.List;

import lt.ssm.po.User;
import lt.ssm.po.UserLogin;
import lt.ssm.pojo.RegisterVo;

public interface UserMapper {
	// 查找用户名 用户注册的验证 
	public List<String> ValiateUsername() throws Exception;
	//用户的注册user表
	public void RegisterUser(RegisterVo registerVo) throws Exception;
	//用户注册userlogin表
	public void RegisterUserlogin(RegisterVo registerVo) throws Exception;
	//登录的验证
	public List<UserLogin> ValiateLogin() throws Exception;
	//显示所有的用户，管理员使用
	public List<User> viewUserInfo() throws Exception;
	//根据ID删除用户
	public void deleteUserLogin(int id) throws Exception;
	public void deleteUser(int id)throws Exception;
	
	//根据ID更新用户信息
	public void updateUser(User user)throws Exception;
	//修改密码操作
	public void updateModifyPsd(UserLogin userLogin)throws Exception;
}
