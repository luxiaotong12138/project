package lt.ssm.mapper;

import java.util.List;

import lt.ssm.po.Items;
import lt.ssm.pojo.BestSeller;
import lt.ssm.pojo.PageItemsVo;

public interface ItemsMapper {
	//�������Ͳ���items��һ��
	public List<Items> findItemsBytypeF(String ordertype) throws Exception;
	//����id����items
	public List<Items> findItemsById(int id) throws Exception;
	//�������Ͳ���items���һ��
	public List<Items> findItemsBytypeL(String ordertype) throws Exception;
	//�������Ͳ��Ҹ����͵���Ʒ�ж�����
	public int totalRecord(String type) throws Exception;
	//�������͵ķ�ҳ
	public List<Items> findItemsBytypePageF(PageItemsVo pageItemsVo) throws Exception;
	public List<Items> findItemsBytypePageL(PageItemsVo pageItemsVo) throws Exception;
	//�������ܵ�ʵ��
	public List<Items> searchItemsByName(String name) throws Exception;
	//��ʾitems��
	public List<Items> viewItems()throws Exception;
	//����IDɾ����Ʒ
	public  void deleteItems(int id)throws Exception;
	//������Ʒ��Ϣ
	public void updateItems(Items items)throws Exception;
	//��ʾ������Ʒ
	public List<BestSeller> viewBestSeller()throws Exception;
}
