package com.asp.micrositio.eiyu.model;

import lombok.Data;

@Data
public class Pagination {

	private long totalRecords;
	private int currentPage;
	private int totalPages;
	private Integer nextPage;
	private Integer prevPage;

}
