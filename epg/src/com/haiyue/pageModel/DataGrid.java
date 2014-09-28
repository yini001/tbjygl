package com.haiyue.pageModel;

import java.util.ArrayList;
import java.util.List;

public class DataGrid {

	private Long total = 0l;
	@SuppressWarnings("rawtypes")
	private List rows = new ArrayList();

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@SuppressWarnings("rawtypes")
	public List getRows() {
		return rows;
	}

	public void setRows(@SuppressWarnings("rawtypes") List rows) {
		this.rows = rows;
	}

}
