package lt.ssm.pojo;

import java.io.Serializable;
import java.util.List;

import lt.ssm.po.Items;

public class Pager implements Serializable {

	/**
	 * 实现分页显示
	 */
	private static final long serialVersionUID = -7385655914304735317L;
	//每页显示多少条记录   8条
    private int pageSize;
    //当前第几页数据		通过jsp页面返回
    private int currentPage;
    //一共有多少条记录		SELECT count(*) FROM orders.items where ordertype='电器';
    private int totalRecord;
    //一共多少页记录		总共的数据/每页要显示的数据+1
    private int totalPage;
    //要显示的数据，使用泛型
    private List<Items> dataList;

    public Pager() {
        super();
    }

    public Pager(int pageSize, int currentPage, int totalRecord, int totalPage, List<Items> dataList) {
        super();
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.dataList = dataList;
    }
//pageNum 当前页面数
    public Pager(int pageNum, int pageSize, List<Items> sourceList){
        if (sourceList == null){
            return;
        }

        //总记录条数
        this.totalRecord = sourceList.size();
        //每页显示多少条记录
        this.pageSize = pageSize;
        //获取总页数
        this.totalPage = this.totalRecord / this.pageSize;
        if (this.totalRecord % this.pageSize != 0) {
            this.totalPage += 1;
        }

        //当前第几页数据
        this.currentPage = this.totalPage < pageNum ? this.totalPage : pageNum;

        //起始索引
        int fromIndex = this.pageSize * (this.currentPage - 1);
        //结束索引
        int toIndex =this.pageSize * this.currentPage > this.totalRecord ?  this.totalRecord :  this.pageSize * this.currentPage;

        this.dataList = sourceList.subList(fromIndex, toIndex);
    }

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getTotalRecord() {
        return totalRecord;
    }
    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public List<Items> getDataList() {
        return dataList;
    }
    public void setDataList(List<Items> dataList) {
        this.dataList = dataList;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }



}
