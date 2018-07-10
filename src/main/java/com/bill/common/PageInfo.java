package com.bill.common;

import java.io.Serializable;

/**
 * 分页信息实体类
 * Created by sky on 2018/7/9.
 */
public class PageInfo  implements Serializable{

	private Integer pageNo;
	private Integer pageSize;
	private Integer totalPage;
	private Integer totalRow;

	public  PageInfo(){

	};

	public PageInfo(Integer pageNo, Integer pageSize, Integer totalPage, Integer totalRow) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.totalRow = totalRow;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(Integer totalRow) {
		this.totalRow = totalRow;
	}

	@Override
	public String toString() {
		return "PageInfo{" +
				"pageNo=" + pageNo +
				", pageSize=" + pageSize +
				", totalPage=" + totalPage +
				", totalRow=" + totalRow +
				'}';
	}
}
