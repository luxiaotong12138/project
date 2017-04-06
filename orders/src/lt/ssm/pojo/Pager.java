package lt.ssm.pojo;

import java.io.Serializable;
import java.util.List;

import lt.ssm.po.Items;

public class Pager implements Serializable {

	/**
	 * ʵ�ַ�ҳ��ʾ
	 */
	private static final long serialVersionUID = -7385655914304735317L;
	//ÿҳ��ʾ��������¼   8��
    private int pageSize;
    //��ǰ�ڼ�ҳ����		ͨ��jspҳ�淵��
    private int currentPage;
    //һ���ж�������¼		SELECT count(*) FROM orders.items where ordertype='����';
    private int totalRecord;
    //һ������ҳ��¼		�ܹ�������/ÿҳҪ��ʾ������+1
    private int totalPage;
    //Ҫ��ʾ�����ݣ�ʹ�÷���
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
//pageNum ��ǰҳ����
    public Pager(int pageNum, int pageSize, List<Items> sourceList){
        if (sourceList == null){
            return;
        }

        //�ܼ�¼����
        this.totalRecord = sourceList.size();
        //ÿҳ��ʾ��������¼
        this.pageSize = pageSize;
        //��ȡ��ҳ��
        this.totalPage = this.totalRecord / this.pageSize;
        if (this.totalRecord % this.pageSize != 0) {
            this.totalPage += 1;
        }

        //��ǰ�ڼ�ҳ����
        this.currentPage = this.totalPage < pageNum ? this.totalPage : pageNum;

        //��ʼ����
        int fromIndex = this.pageSize * (this.currentPage - 1);
        //��������
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
