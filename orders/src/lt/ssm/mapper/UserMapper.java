package lt.ssm.mapper;

import java.util.List;

import lt.ssm.po.User;
import lt.ssm.po.UserLogin;
import lt.ssm.pojo.RegisterVo;

public interface UserMapper {
	// �����û��� �û�ע�����֤ 
	public List<String> ValiateUsername() throws Exception;
	//�û���ע��user��
	public void RegisterUser(RegisterVo registerVo) throws Exception;
	//�û�ע��userlogin��
	public void RegisterUserlogin(RegisterVo registerVo) throws Exception;
	//��¼����֤
	public List<UserLogin> ValiateLogin() throws Exception;
	//��ʾ���е��û�������Աʹ��
	public List<User> viewUserInfo() throws Exception;
	//����IDɾ���û�
	public void deleteUserLogin(int id) throws Exception;
	public void deleteUser(int id)throws Exception;
	
	//����ID�����û���Ϣ
	public void updateUser(User user)throws Exception;
	//�޸��������
	public void updateModifyPsd(UserLogin userLogin)throws Exception;
}
