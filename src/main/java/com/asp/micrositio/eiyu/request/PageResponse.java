package com.asp.micrositio.eiyu.request;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import com.asp.micrositio.eiyu.model.Pagination;

import lombok.Data;

@Data
public class PageResponse<T> {

	private final List<T> content;
	private final Pagination pagination;

	public PageResponse(Page<T> page) {
		this(page, page.getContent());
	}

	public PageResponse(Page<?> page, Function<Object, T> converter) {
		this(page, page.getContent().stream().map(converter).collect(Collectors.toList()));
	}

	public PageResponse(Page<?> page, List<T> data) {
		this.pagination = new Pagination();
		this.pagination.setTotalRecords(page.getTotalElements());
		this.pagination.setTotalPages(page.getTotalPages());
		this.pagination.setCurrentPage(page.getNumber() + 1);
		this.pagination.setNextPage(page.getNumber() + 1 < page.getTotalPages() ? page.getNumber() + 2 : null);
		this.pagination.setPrevPage(page.getNumber() + 1 > 1 ? page.getNumber() : null);
		this.content = data;
	}

}
