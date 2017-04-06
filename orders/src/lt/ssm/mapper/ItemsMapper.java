package lt.ssm.mapper;

import java.util.List;

import lt.ssm.po.Items;
import lt.ssm.pojo.BestSeller;
import lt.ssm.pojo.PageItemsVo;

public interface ItemsMapper {
	//根据类型查找items第一行
	public List<Items> findItemsBytypeF(String ordertype) throws Exception;
	//根据id查找items
	public List<Items> findItemsById(int id) throws Exception;
	//根据类型查找items最后一行
	public List<Items> findItemsBytypeL(String ordertype) throws Exception;
	//根据类型查找该类型的物品有多少种
	public int totalRecord(String type) throws Exception;
	//根据类型的分页
	public List<Items> findItemsBytypePageF(PageItemsVo pageItemsVo) throws Exception;
	public List<Items> findItemsBytypePageL(PageItemsVo pageItemsVo) throws Exception;
	//搜索功能的实现
	public List<Items> searchItemsByName(String name) throws Exception;
	//显示items表
	public List<Items> viewItems()throws Exception;
	//根据ID删除商品
	public  void deleteItems(int id)throws Exception;
	//更新商品信息
	public void updateItems(Items items)throws Exception;
	//显示热销商品
	public List<BestSeller> viewBestSeller()throws Exception;
}
